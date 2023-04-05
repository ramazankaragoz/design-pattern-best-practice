package com.example.designpattern.demo.structural.decorator;

public class DecoratorExample {

    public static void main(String[] args) {
        Car sportsCar=new SportCar(new BasicCar());

        sportsCar.assemble();

        System.out.println("##################");
        Car luxuryCar=new LuxuryCar(new SportCar(new BasicCar()));
        luxuryCar.assemble();

    }
}
