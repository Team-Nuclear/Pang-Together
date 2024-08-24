package com.pangTogether.service;

import com.pangTogether.domain.Cart;
import com.pangTogether.domain.PaymentType;
import com.pangTogether.domain.Status;
import com.pangTogether.dto.CartDTO;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;
import java.util.List;


public interface CartService {
//    public List<CartDTO> getCart();

    public CartDTO createCart(String name, Timestamp createdAt, Status status, PaymentType paymentType, String shareCode, String cartCategory);



}
