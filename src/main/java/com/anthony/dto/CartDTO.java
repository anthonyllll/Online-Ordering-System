package com.anthony.dto;

import lombok.Data;


@Data
public class CartDTO {

    /** ååId. */
    private String productId;

    /** æ°é. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
