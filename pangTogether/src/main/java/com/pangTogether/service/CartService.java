package com.pangTogether.service;

import com.pangTogether.dto.CartDTO;
import org.springframework.stereotype.Service;


public interface CartService {
    public CartDTO getCartById(long cartId);

}
