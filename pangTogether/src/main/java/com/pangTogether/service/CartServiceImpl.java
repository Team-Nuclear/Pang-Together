package com.pangTogether.service;


import com.pangTogether.dto.CartDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    @Override
    public CartDTO getCartById(long cartId) {
        return null;
    }
}
