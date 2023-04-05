package com.example.designpattern.demo.structural.decorator;

public class SportCar extends CarDecorator{
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Added features of Sports Car.");
    }
}
