package com.example.demo.payload;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String email;
    private String password;
} 