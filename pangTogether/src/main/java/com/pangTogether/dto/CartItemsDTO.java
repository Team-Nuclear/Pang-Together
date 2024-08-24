package com.pangTogether.dto;

import com.pangTogether.domain.Cart;
import com.pangTogether.domain.Product;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CartItemsDTO {
    private Long cartItemsId;

    private Long productId;

    private Long cartId;

    private int quantity;
}
