package com.example.designpattern.demo.behavioral.chain;

public interface TransactionHandler {
    void setNext(TransactionHandler nextHandler);
    void handleTransaction(Transaction transaction);
}