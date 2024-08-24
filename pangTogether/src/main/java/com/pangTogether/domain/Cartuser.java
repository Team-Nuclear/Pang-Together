package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart_users")
@Getter
@Builder
@AllArgsConstructor
public class Cartuser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_users_id")
    private Long cartUsersId;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable = false)
    private Cart cartId;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User userId;

    @Column(name="is_payment_authority")
    private boolean isPaymentAuthority;

    @Enumerated(EnumType.STRING)
    @Column(name="payment_status")
    private PaymentStatus paymentStatus;

    public Cartuser toDomain(Cart cart, User user) {
        return Cartuser.builder()
                .cartId(cart)
                .userId(user)
                .isPaymentAuthority(this.isPaymentAuthority())
                .paymentStatus(this.getPaymentStatus())
                .build();
    }

    public Cartuser() {

    }
}
