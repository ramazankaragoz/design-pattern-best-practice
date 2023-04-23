package com.example.designpattern.demo.behavioral.chain;

public class WithdrawalHandler implements TransactionHandler{

    private TransactionHandler nextHandler;
    private double balance;

    public WithdrawalHandler(double balance) {
        this.balance = balance;
    }

    @Override
    public void setNext(TransactionHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == TransactionType.WITHDRAWAL) {
            if (transaction.getAmount() <= balance) {
                balance -= transaction.getAmount();
                System.out.println("Withdrawal of " + transaction.getAmount() + " is successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient balance for withdrawal of " + transaction.getAmount());
            }
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        } else {
            System.out.println("Invalid transaction type");
        }
    }
}
