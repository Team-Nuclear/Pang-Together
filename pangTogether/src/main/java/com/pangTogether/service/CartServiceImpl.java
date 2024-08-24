package com.pangTogether.service;


import com.pangTogether.domain.Cart;
import com.pangTogether.domain.PaymentType;
import com.pangTogether.domain.Status;
import com.pangTogether.dto.CartDTO;
import com.pangTogether.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;


@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    public CartDTO createCart(String name, Timestamp createdAt, Status status, PaymentType paymentType, String shareCode, String cartCategory) {
        Cart cart = Cart.builder()
                .name(name)
                .createdAt(createdAt)
                .status(status)
                .paymentType(paymentType)
                .shareCode(shareCode)
                .cartCategory(cartCategory)
                .build();

        cartRepository.save(cart);

        return CartDTO.builder()
                .cartId(cart.getCartId())
                .name(cart.getName())
                .createdAt(cart.getCreatedAt())
                .status(cart.getStatus().name())
                .paymentType(cart.getPaymentType().name())
                .shareCode(cart.getShareCode())
                .cartCategory(cart.getCartCategory())
                .build();
    }


//    @Override
//    public List<CartDTO> getCart() {
//        List<Cart> cartList = cartRepository.findAllwith();
//        List<CartDTO> cartDTOList = new ArrayList<>();
//
//        for(Cart cart : cartList) {
//            CartDTO cartDTO = new CartDTO();
//            cartDTO.setCartId(cart.getCartId());
//            cartDTO.setName(cart.getName());
//            cartDTO.setCreatedAt(cart.getCreatedAt());
//            cartDTO.setStatus(String.valueOf(cart.getStatus()));
//            cartDTO.setPaymentType(String.valueOf(cart.getPaymentType()));
//            cartDTO.setShareCode(cart.getShareCode());
//            cartDTO.setCartCategory(cart.getCartCategory());
//
//            cartDTOList.add(cartDTO);
//        }
//
//        return cartDTOList;
//    }

    // @Query("Insert into carts (name, created_at, status, payment_type, share_code, cart_category) values(:name, :shareCode, :cartCategory)")
    //    void createUsersCart(@Param("name", "shareCode", "cartCategory") Long userId, String shareCode, String cartCategory);
}
