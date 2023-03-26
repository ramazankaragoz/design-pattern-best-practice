package com.example.designpattern.demo.structural.adapter;

public class ThirdPartyPaymentImpl implements ThirdPartyPayment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of amount: " + amount + " via third-party payment gateway.");
    }
}
