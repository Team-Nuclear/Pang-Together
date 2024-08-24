package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "orders")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @Column(name="orders_id")
    private Long ordersId;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable = false)
    private Cart cartId;

    @Column(name="total_amount")
    private double totalAmount;

    @Column(name="created_at")
    private Timestamp createdAt;

}
