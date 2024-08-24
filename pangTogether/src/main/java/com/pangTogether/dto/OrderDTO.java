package com.pangTogether.dto;

import com.pangTogether.domain.Cart;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class OrderDTO {
    private Long ordersId;

    private Long cartId;

    private double totalAmount;

    private Timestamp createdAt;
}
