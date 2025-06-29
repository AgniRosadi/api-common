# api-common

Library Java berisi model, DTO, dan class helper bersama untuk project microservices.

## Struktur

- `com.api.common.dto` → Berisi DTO umum seperti `VirtualAccountRes`, dll
- Tidak ada logic, hanya data structure

## Requirements

- Java 17
- Maven

## Build & Install
mvn clean install
Pastikan module ini sudah di-install ke local .m2 sebelum dipakai di service lain.

Catatan
Module ini tidak dijalankan standalone, hanya digunakan sebagai dependency.

## **2. `subscriber-service` README.md**

# subscriber-service

Service untuk mengelola data Virtual Account dan publish update ke Redis agar service lain dapat sinkronisasi.

## Fitur Utama

- Load data prefix VA dari DB ke Redis
- Publish event Redis ke channel `virtual-account` saat data berubah

## Requirements

- Java 17
- Maven
- Redis

## Running

````
mvn spring-boot:run
````
Environment
Contoh application.yaml:


````spring:
application:
    name: subscriber-service
  redis:
    host: localhost
    port: 6379
server:
  port: 8084

````

Catatan
Pastikan Redis sudah running sebelum menjalankan service ini

Service ini hanya publish event Redis, tidak listen

## **3. `client-service` README.md**

# client-service

Service consumer yang listen Redis channel `virtual-account` untuk sinkronisasi prefix VA dari Redis ke memory (TreeMap).

## Fitur Utama

- Listen Redis Pub/Sub channel
- Refresh data prefixMap saat ada event dari Redis
- Cek prefix VA secara efisien via TreeMap

## Requirements

- Java 17
- Maven
- Redis

## Running
````
mvn spring-boot:run
````
Environment
Contoh application.yaml:
````
spring:
  application:
    name: client-service
  redis:
    host: localhost
    port: 6379
url:
  subscriber-service: http://localhost:8084
server:
  port: 8082
````
## Catatan
Pastikan Redis sudah running sebelum menjalankan service ini

Pastikan subscriber-service sudah publish data ke Redis
