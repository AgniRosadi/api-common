package com.api.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrefixDataReq implements Serializable {
    private Long id;
    private String prefix;
    private Long categoryId;
    private Long billerId;
}
