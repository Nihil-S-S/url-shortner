package com.url.shortner.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "app_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String emailId;
    private String userName;
    private String password;
    private String role = "ROLE_USER";
}
