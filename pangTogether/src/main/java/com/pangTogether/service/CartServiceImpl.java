package com.pangTogether.service;


import com.pangTogether.domain.*;
import com.pangTogether.dto.CartDTO;
import com.pangTogether.dto.CartuserDTO;
import com.pangTogether.repository.CartRepository;
import com.pangTogether.repository.CartuserRepository;
import com.pangTogether.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartuserRepository cartuserRepository;






    // 공유 장바구니에 입장한 사람 리스트를 위한 리스트 생성
    public CartuserDTO createCartUser(Long cartId, Long userId) {
        try {
            System.out.println("Cart ID: " + cartId);
            System.out.println("User ID: " + userId);
            if (cartId == null || userId == null) {
                throw new IllegalArgumentException("Cart ID or User ID cannot be null");
            }

            // Create CartuserDTO
            CartuserDTO cartuserDTO = CartuserDTO.builder()
//                    .cartId(cartId)
                    .userId(userId)
                    .isPaymentAuthority(false)
                    .paymentStatus(PaymentStatus.PENDING) // Use enum directly
                    .build();

            System.out.println("Fetching cart with ID: " + cartId);
            // Fetch Cart and User entities
            Optional<Cart> optionalCart = cartRepository.findById(cartId);
            Optional<User> optionalUser = userRepository.findById(userId);

            // Check if Cart and User are present
            if (!optionalCart.isPresent()) {
                throw new RuntimeException("Cart not found");
            }

            if (!optionalUser.isPresent()) {
                throw new RuntimeException("User not found");
            }

            // Extract Cart and User from Optional
            Cart cart = optionalCart.get();
            User user = optionalUser.get();

            // Convert DTO to Cartuser entity
            Cartuser cartuser = Cartuser.builder()
                    .cartId(cart)
                    .userId(user)
                    .isPaymentAuthority(cartuserDTO.isPaymentAuthority())
                    .paymentStatus(cartuserDTO.getPaymentStatus())
                    .build();

            // Save Cartuser entity
            cartuserRepository.save(cartuser);


            // Return the CartuserDTO or any other suitable response
            return cartuserDTO;

        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception as needed (e.g., return a different response or throw a custom exception)
            return null;
        }
    }

    // 공유 장바구니 생성
    public CartDTO createCart(String name, Timestamp createdAt, Status status, PaymentType paymentType, String shareCode, String cartCategory) {
        try {
            System.out.println("Checking for existing cart with name: " + name);
            // Check if a Cart with the same name already exists
            Optional<Cart> existingCart = cartRepository.findByName(name);
            System.out.println("진심? " + existingCart);
            if (existingCart.isPresent()) {
                System.out.println("Existing cart found with name: " + name);
                throw new RuntimeException("Cart already exists with name: " + name);
            } else {
                System.out.println("No existing cart found with name: " + name);
            }

//            Cart cart = Cart.builder()
//                    .cartId(77L)
//                    .name(name)
//                    .createdAt(createdAt)
//                    .status(status)
//                    .paymentType(paymentType)
//                    .shareCode(shareCode)
//                    .cartCategory(cartCategory)
//                    .build();

//            cart = cartRepository.save(cart);
//            System.out.println("Created Cart ID: " + cart.getCartId());

            Optional<User> user = userRepository.findByUsername(name);
            System.out.println("User ID found by name: " + user);
            if (user == null) {
                throw new RuntimeException("User not found with name: " + name);
            }
            System.out.println("Found User Info: " + user.toString());


            Cart cart = Cart.builder()
                    .cartId(user.get().getUserId())
                    .name(name)
                    .createdAt(createdAt)
                    .status(status)
                    .paymentType(paymentType)
                    .shareCode(shareCode)
                    .cartCategory(cartCategory)
                    .build();
            cart = cartRepository.save(cart);

            Long userId = user.get().getUserId();
            System.out.println("User ID found by name: " + userId);

            CartuserDTO cartuserDTO = createCartUser(cart.getCartId(), userId);

            return CartDTO.builder()
                    .cartId(cart.getCartId())
                    .name(cart.getName())
                    .createdAt(cart.getCreatedAt())
                    .status(cart.getStatus().name())
                    .paymentType(cart.getPaymentType().name())
                    .shareCode(cart.getShareCode())
                    .cartCategory(cart.getCartCategory())
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 추천코드 3자리수 랜덤하게 만들어 주는 메소드

    /**
     * Generates 3 random character to generate random sharecode
     * @param length : Receiving length just in case of changing the length of the sharecode
     * @return 3 randomly generated charaacter
     *
     * @Author : Tae Jin Kim
     */
    public static String generateRandomString(int length) {
        try {
            // Define the characters to choose from
            String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder result = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                // Generate a random index
                int index = (int) (Math.random() * characters.length());
                // Append the character at the random index to the result
                result.append(characters.charAt(index));
            }

            return result.toString();
        } catch (Exception e ) {
            e.printStackTrace();
            return "";
        }

    }

    // 추천코드 3글자 + 랜덤 3숫자 합한 값 리턴

    /**
     * Generates Random Sharecode --> 3 random characters + 3 digit random integer
     * @return full randomly generated sharecode
     * @Author : Tae Jin Kim
     */
    @Override
    public String generateShareCode() {
        Integer randomNum = 100 + (int) (Math.random() * 900);
        StringBuilder sb = new StringBuilder().append(generateRandomString(3)).append(randomNum);
        return sb.toString();
    }





}
