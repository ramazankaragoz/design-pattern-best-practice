package com.example.designpattern.demo.behavioral.chain;

public class Bank {
    private TransactionHandler transactionHandler;

    public Bank() {
        transactionHandler=new WithdrawalHandler(5000);
        TransactionHandler depositHandler=new DepositHandler(5000);
        TransactionHandler transferHandler=new TransferHandler(5000);
        transactionHandler.setNext(depositHandler);
        depositHandler.setNext(transferHandler);
    }

    public void makeTransaction(Transaction transaction) {
        transactionHandler.handleTransaction(transaction);
    }
}
