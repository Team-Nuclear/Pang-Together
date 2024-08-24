package com.pangTogether.dto;

import com.pangTogether.domain.Cart;
import com.pangTogether.domain.Cartuser;
import com.pangTogether.domain.PaymentStatus;
import com.pangTogether.domain.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class CartuserDTO {
    private Long cartUsersId;

    private Long cartId;

    private Long userId;

    private boolean isPaymentAuthority;

    private PaymentStatus paymentStatus;

    // Convert DTO to Domain
    public Cartuser toDomain(Cart cart, User user) {
        return Cartuser.builder()
                .cartId(cart)
                .userId(user)
                .isPaymentAuthority(isPaymentAuthority)
                .paymentStatus(paymentStatus)
                .build();
    }
}
