package com.pangTogether.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
public class User {
    @Id
    @Column(name="user_id")
    private Long userId;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="address2")
    private String address2;

    @Column(name="contact")
    private String contact;

}
