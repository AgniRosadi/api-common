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
