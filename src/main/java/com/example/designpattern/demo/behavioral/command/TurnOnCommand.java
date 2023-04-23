package com.example.designpattern.demo.behavioral.command;

// ConcreteCommand sınıfı
public class TurnOnCommand implements Command {
    private LightReceiver light;

    public TurnOnCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}