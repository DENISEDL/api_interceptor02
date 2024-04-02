package com.example.api.interceptor02.services;

import org.springframework.stereotype.Service;

@Service
public class BasicService {
    public String hello() {
        String saluto = "Benvenuti";
        return saluto;
    }
}
