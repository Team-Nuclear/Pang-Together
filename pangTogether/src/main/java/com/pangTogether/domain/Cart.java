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
@Table(name = "carts")
@Getter
@Builder
@AllArgsConstructor
public class Cart {
    @Id
    @Column(name = "cart_id")
    private Long cartId;

    @Column(name ="name")
    private String name;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="status")
    private Status status;

    @Column(name="paymnet_type")
    private PaymentType paymentType;

    @Column(name="share_code")
    private String shareCode;

    @Column(name="cart_category")
    private String cartCategory;

    public Cart(){}
}
