package com.example.designpattern.demo.structural.adapter;

public class MobilePaymentImpl implements MobilePayment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Making payment of amount: " + amount + " via mobile  payment gateway.");
    }
}
