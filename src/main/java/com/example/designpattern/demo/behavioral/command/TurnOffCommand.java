package com.example.designpattern.demo.behavioral.command;

// ConcreteCommand sınıfı
public class TurnOffCommand implements Command {
    private LightReceiver light;

    public TurnOffCommand(LightReceiver light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}