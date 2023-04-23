package com.example.designpattern.demo.behavioral.command;

// Receiver sınıfı
public class LightReceiver {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}