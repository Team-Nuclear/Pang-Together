package com.pangTogether.controller;

import com.pangTogether.dto.CartDTO;
import com.pangTogether.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    @GetMapping(path ="/api/carts")
    public List<CartDTO> getAllList(){ return cartService.getCart();}
}
