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
    public CartDTO createCart(@RequestParam(name = "name") String name,
                                @RequestParam(name = "createdAt") Timestamp createdAt,
                                @RequestParam(name = "status") Status status,
                                @RequestParam(name = "paymentType") PaymentType paymentType,
                                @RequestParam(name = "cartCategory") String cartCategory) {
                                
        System.out.println(name);                       
        String randomShareCode = cartService.generateShareCode();
        System.out.println(randomShareCode);
        return cartService.createCart(name, createdAt, status, paymentType, randomShareCode, cartCategory);
    }

    @PostMapping(path = "/api/carts/join")
    public boolean joinCartUser(@RequestParam String shareCode, @RequestParam Long userId) {
        return cartUserService.joinCartUser(shareCode, userId);
    }

}
