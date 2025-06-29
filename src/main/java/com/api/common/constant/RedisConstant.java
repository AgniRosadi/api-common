package com.api.common.constant;

public enum RedisConstant {

    REDIS_PREFIX_CACHE("prefix_data");

    private final String name;

    RedisConstant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

