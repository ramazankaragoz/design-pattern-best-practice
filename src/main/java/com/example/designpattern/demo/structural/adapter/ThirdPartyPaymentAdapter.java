package com.example.designpattern.demo.structural.adapter;

public class ThirdPartyPaymentAdapter implements Payment{

    private ThirdPartyPayment thirdPartyPayment;


    public ThirdPartyPaymentAdapter(ThirdPartyPayment thirdPartyPayment) {
        this.thirdPartyPayment = thirdPartyPayment;
    }

    @Override
    public void pay(double amount) {
        thirdPartyPayment.makePayment(amount);
    }
}
