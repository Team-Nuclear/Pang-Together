package com.pangTogether.service;

import com.pangTogether.dto.CartDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CartService {
    public List<CartDTO> getCart();

}
