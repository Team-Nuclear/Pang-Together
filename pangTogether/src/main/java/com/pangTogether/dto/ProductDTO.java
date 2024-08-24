package com.pangTogether.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProductDTO {
    private Long productId;

    private String name;

    private double price;

    private String category;

    private Timestamp expirationDate;

    private String manufacturer;

    private Long soldQuantity;
}
