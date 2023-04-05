package com.example.designpattern.demo.structural.facade;

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void start() {
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 100));
        cpu.jump(0);
        cpu.execute();
    }
}