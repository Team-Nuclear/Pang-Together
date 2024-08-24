package com.pangTogether.controller;

import com.pangTogether.domain.PaymentType;
import com.pangTogether.domain.Status;
import com.pangTogether.dto.CartDTO;
import com.pangTogether.service.CartService;
import com.pangTogether.service.CartUserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequiredArgsConstructor
public class CartController {

    @Autowired
    private final CartService cartService;

    @Autowired
    private final CartUserServiceImpl cartUserService;

    @PostMapping(path="/api/carts")
    public CartDTO createCart(@RequestParam String name,
                              @RequestParam Timestamp createdAt,
                              @RequestParam Status status,
                              @RequestParam PaymentType paymentType,
                              @RequestParam String cartCategory) {

        String randomShareCode = cartService.generateShareCode();
        return cartService.createCart(name, createdAt, status, paymentType, randomShareCode, cartCategory);
    }

    @PostMapping(path = "/api/carts/join")
    public boolean joinCartUser(@RequestParam String shareCode, @RequestParam Long userId) {
        return cartUserService.joinCartUser(shareCode, userId);
    }

}
