package com.example.designpattern.demo.structural.adapter;

public class MobilePaymentAdapter implements Payment{

    private MobilePayment mobilePayment;


    public MobilePaymentAdapter(MobilePayment mobilePayment) {
        this.mobilePayment = mobilePayment;
    }

    @Override
    public void pay(double amount) {
        mobilePayment.makePayment(amount);
    }
}
