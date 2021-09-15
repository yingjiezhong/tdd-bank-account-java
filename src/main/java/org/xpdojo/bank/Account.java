package org.xpdojo.bank;

public class Account {

    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {

    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
