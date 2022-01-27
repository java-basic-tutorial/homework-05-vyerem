package com.softserveinc.task01;

public class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) {
        // TODO: if amount is negative - throw IllegalArgumentException
        balance += amount;
    }

    public void withdraw(long amount) {
        // TODO: if amount is negative - throw IllegalArgumentException
        // TODO: if amount higher than balance - throw NoManyEnoughException
        balance -= amount;
    }
}
