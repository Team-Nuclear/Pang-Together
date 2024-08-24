package com.pangTogether.service;


import com.pangTogether.domain.Cart;
import com.pangTogether.dto.CartDTO;
import com.pangTogether.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;
    @Override
    public List<CartDTO> getCart() {
        List<Cart> cartList = cartRepository.findAllwith();
        List<CartDTO> cartDTOList = new ArrayList<>();

        for(Cart cart : cartList) {
            CartDTO cartDTO = new CartDTO();
            cartDTO.setCartId(cart.getCartId());
            cartDTO.setName(cart.getName());
            cartDTO.setCreatedAt(cart.getCreatedAt());
            cartDTO.setStatus(String.valueOf(cart.getStatus()));
            cartDTO.setPaymentType(String.valueOf(cart.getPaymentType()));
            cartDTO.setShareCode(cart.getShareCode());
            cartDTO.setCartCategory(cart.getCartCategory());

            cartDTOList.add(cartDTO);
        }

        return cartDTOList;
    }
}
