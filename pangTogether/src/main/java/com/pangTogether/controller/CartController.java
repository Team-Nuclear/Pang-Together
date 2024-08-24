package com.pangTogether.controller;

import com.pangTogether.domain.PaymentType;
import com.pangTogether.domain.Status;
import com.pangTogether.dto.CartDTO;
import com.pangTogether.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequiredArgsConstructor
public class CartController {

    @Autowired
    private final CartService cartService;
    @PostMapping
    public CartDTO createCart(@RequestParam String name,
                              @RequestParam Timestamp createdAt,
                              @RequestParam Status status,
                              @RequestParam PaymentType paymentType,
                              @RequestParam String shareCode,
                              @RequestParam String cartCategory) {
        return cartService.createCart(name, createdAt, status, paymentType, shareCode, cartCategory);
    }


}
