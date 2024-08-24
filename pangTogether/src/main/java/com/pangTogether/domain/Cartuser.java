package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart_users")
@Getter
@NoArgsConstructor
public class Cartuser {
    @Id
    @Column(name="cart_users_id")
    private Long cartUsersId;

    @ManyToOne
    @Column(name="cart_id", nullable = false)
    private Cart cartId;

    @ManyToOne
    @Column(name="user_id", nullable = false)
    private User userId;

    @Column(name="is_payment_authority")
    private boolean isPaymentAuthority;

    @Column(name="payment_status")
    private PaymentStatus paymentStatus;

}
