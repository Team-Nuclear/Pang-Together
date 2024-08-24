package com.pangTogether.dto;

import com.pangTogether.domain.Cart;
import com.pangTogether.domain.PaymentStatus;
import com.pangTogether.domain.PaymentType;
import com.pangTogether.domain.Status;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CartDTO {
    private Long cartId;

    private String name;

    private Timestamp createdAt;

    private String status;

    private String paymentType;

    private String shareCode;

    private String cartCategory;

    public CartDTO() {}

    // dto to domain
    public Cart toDomain() {
        return Cart.builder()
                .cartId(cartId)
                .name(name)
                .createdAt(createdAt)
//                .status(PaymentStatus.valueOf(status))
//                .paymentType(paymentType)
                .shareCode(shareCode)
                .cartCategory(cartCategory)
                .build();

    }

    // formatting timestamp
    public String getCreatedAt() {
        return createdAt != null ? createdAt.toLocalDateTime().toString() : null;
    }
}
