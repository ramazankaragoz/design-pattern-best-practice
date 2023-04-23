package com.example.designpattern.demo.behavioral.chain;

public class DepositHandler implements TransactionHandler {
    private TransactionHandler nextHandler;
    private double balance;

    public DepositHandler(double balance) {
        this.balance = balance;
    }

    public void setNext(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == TransactionType.DEPOSIT) {
            balance += transaction.getAmount();
            System.out.println("Deposit of " + transaction.getAmount() + " is successful. New balance: " + balance);
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        } else {
            System.out.println("Invalid transaction type");
        }
    }
}