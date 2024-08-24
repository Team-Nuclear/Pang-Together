package com.pangTogether.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "products")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name="product_id")
    private Long productId;

    @Column(name="p_name")
    private String name;

    @Column(name="p_price")
    private double price;

    @Column(name="p_category")
    private String category;

    @Column(name="expiration_date")
    private Timestamp expirationDate;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="sold_quantity")
    private Long soldQuantity;


}
