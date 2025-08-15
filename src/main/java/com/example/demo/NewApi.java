package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class NewApi {
    public String pay(){
        String payment = "rezorpay";
        System.out.println("payment from "+payment);
        return payment;
    }

}
