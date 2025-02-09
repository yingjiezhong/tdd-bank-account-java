package org.xpdojo.bank;

public class Account {

    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public Account() {

    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}
