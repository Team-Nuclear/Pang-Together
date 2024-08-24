package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart_itmes")
@Getter
@Builder
@AllArgsConstructor
public class CartItems {
    @Id
    @Column(name = "cart_items_id")
    private Long cartItemsId;

    @ManyToOne
    @JoinColumn(name="product_id", nullable = false)
    private Product productId;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable = false)
    private Cart cartId;

    @Column(name="quantity")
    private int quantity;

    public CartItems() {

    }
}
