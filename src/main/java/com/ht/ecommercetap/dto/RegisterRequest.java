package com.ht.ecommercetap.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String role; // "CUSTOMER" or "ADMIN"
}
