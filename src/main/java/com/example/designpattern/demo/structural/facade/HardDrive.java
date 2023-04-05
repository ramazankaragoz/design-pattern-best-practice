package com.example.designpattern.demo.structural.facade;

class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read");
        return new byte[size];
    }
}