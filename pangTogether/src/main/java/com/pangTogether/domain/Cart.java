package com.pangTogether.domain;

import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name="paymnet_type")
    private PaymentType paymentType;

    @Column(name="share_code")
    private String shareCode;

    @Column(name="cart_category")
    private String cartCategory;

    public Cart(){}
}
