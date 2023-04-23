package com.example.designpattern.demo.behavioral.chain;

public class ChainExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Transaction withdrawalTransaction = new Transaction(TransactionType.WITHDRAWAL, 2000);
        bank.makeTransaction(withdrawalTransaction);

        Transaction depositTransaction = new Transaction(TransactionType.DEPOSIT, 3000);
        bank.makeTransaction(depositTransaction);

        Transaction transferTransaction = new Transaction(TransactionType.TRANSFER, 4000);
        bank.makeTransaction(transferTransaction);

        Transaction invalidTransaction = new Transaction(null, 1000);
        bank.makeTransaction(invalidTransaction);
    }
}
