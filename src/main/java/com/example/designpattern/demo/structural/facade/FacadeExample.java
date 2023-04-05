package com.example.designpattern.demo.structural.facade;

public class FacadeExample {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();

        ComputerFacade computer = new ComputerFacade(cpu, memory, hardDrive);
        computer.start();
    }
}