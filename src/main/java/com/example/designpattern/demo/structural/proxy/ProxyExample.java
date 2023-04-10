package com.example.designpattern.demo.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        RemoteService remoteService = new RemoteServiceProxy();
        remoteService.performOperation();
    }
}