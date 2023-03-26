package com.example.designpattern.demo.structural.adapter;

public class AdapterExample {

    public static void main(String[] args) {
        ThirdPartyPayment thirdPartyPayment=new ThirdPartyPaymentImpl();
        Payment payment=new ThirdPartyPaymentAdapter(thirdPartyPayment);
        payment.pay(100.5);

        MobilePayment mobilePayment=new MobilePaymentImpl();
        payment=new MobilePaymentAdapter(mobilePayment);
        payment.pay(40.5);
    }
}
