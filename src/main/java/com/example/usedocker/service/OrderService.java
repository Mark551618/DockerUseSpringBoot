package com.example.usedocker.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public int calculateTotal(int price, int quantity) {

        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("price/quantity 不可為負數");
        }


        return price * quantity;
    }
}