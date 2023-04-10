package com.example.designpattern.demo.structural.proxy;

class RemoteServiceImpl implements RemoteService {
    @Override
    public void performOperation() {
        System.out.println("Performing remote operation");
    }
}