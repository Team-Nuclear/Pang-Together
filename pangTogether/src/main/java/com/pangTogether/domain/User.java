package com.pangTogether.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", address2='" + address2 + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
