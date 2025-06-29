package com.api.common.dto;

import lombok.Data;

@Data
public class VirtualAccountRes {
    private String prefix;
    private Long category;
    private Boolean isOpenAmount;
}
