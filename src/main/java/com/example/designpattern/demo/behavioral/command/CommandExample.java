package com.example.designpattern.demo.behavioral.command;

public class CommandExample {
    public static void main(String[] args) {
        // Receiver nesnesi oluşturulur
        LightReceiver light = new LightReceiver();

        // ConcreteCommand nesneleri oluşturulur
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        // Invoker nesnesi oluşturulur
        RemoteControlInvoker remoteControl = new RemoteControlInvoker();

        // Command nesnesi Invoker nesnesine atanır
        remoteControl.setCommand(turnOnCommand);

        // Invoker nesnesi işlemi yürütür
        remoteControl.pressButton();

        // Command nesnesi Invoker nesnesine atanır
        remoteControl.setCommand(turnOffCommand);

        // Invoker nesnesi işlemi yürütür
        remoteControl.pressButton();
    }
}
