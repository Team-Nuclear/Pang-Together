package com.pangTogether.service;

import com.pangTogether.domain.Cart;
import com.pangTogether.domain.Cartuser;
import com.pangTogether.domain.PaymentStatus;
import com.pangTogether.domain.User;
import com.pangTogether.repository.CartRepository;
import com.pangTogether.repository.CartuserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CartUserServiceImpl implements CartUserService {

    @Autowired
    private final CartuserRepository cartuserRepository;

    @Autowired
    private final CartRepository cartRepository;

    /// sharecode 로 cart id 가지고 와서 user id 넣어주기
    public boolean joinCartUser(String shareCode, Long userId) {
        try {

            Long cartId = cartRepository.getCartIdWithShareCode(shareCode);
            Cart cart = new Cart().builder().cartId(cartId).build();
            User user = new User().builder().userId(userId).build();

            Cartuser cartuser = Cartuser.builder()
                    .cartId(cart)
                    .userId(user)
                    .isPaymentAuthority(false)
                    .paymentStatus(PaymentStatus.PENDING)
                    .build();


            // Save Cartuser entity
            cartuserRepository.save(cartuser);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
