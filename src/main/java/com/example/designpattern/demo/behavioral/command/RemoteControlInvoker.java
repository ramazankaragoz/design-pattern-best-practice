package com.example.designpattern.demo.behavioral.command;

// Invoker sınıfı
public class RemoteControlInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}