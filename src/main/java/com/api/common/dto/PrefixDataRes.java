package com.api.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrefixDataRes implements PrefixDataInterface, Serializable {
    private String prefix;
    private Long categoryId;
    private Boolean isHandler;
}
