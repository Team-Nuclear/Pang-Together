package com.pangTogether.dto;

import com.pangTogether.domain.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserDTO {

    private Long userId;

    private String username;

    private String email;

    private String address;

    private String address2;

    private String contact;

    public User convertToEntity(UserDTO userDTO) {
        return User.builder()
                .userId(userDTO.getUserId())
                .username(userDTO.getUsername())
                .email(userDTO.getEmail())
                .address(userDTO.getAddress())
                .address2(userDTO.getAddress2())
                .contact(userDTO.getContact())
                .build();
    }
}
