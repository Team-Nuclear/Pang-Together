package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Table(name = "carts")
@Getter
@Builder
@Setter
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;

    @Column(name ="name", unique = true)
    private String name;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name="payment_type")
    private PaymentType paymentType;

    @Column(name="share_code")
    private String shareCode;

    @Column(name="cart_category")
    private String cartCategory;

    public Cart(){}
}
