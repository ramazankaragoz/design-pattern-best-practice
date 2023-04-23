package com.example.designpattern.demo.behavioral.chain;

public class TransferHandler implements TransactionHandler {
    private TransactionHandler nextHandler;
    private double balance;

    public TransferHandler(double balance) {
        this.balance = balance;
    }

    public void setNext(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == TransactionType.TRANSFER) {
            if (transaction.getAmount() <= balance) {
                balance -= transaction.getAmount();
                System.out.println("Transfer of " + transaction.getAmount() + " is successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance for transfer of " + transaction.getAmount());
            }
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        } else {
            System.out.println("Invalid transaction type");
        }
    }
}