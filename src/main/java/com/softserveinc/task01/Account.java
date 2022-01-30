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
        if(amount < 0) {
            throw new IllegalArgumentException("Amount should be positive");
        }
        balance += amount;
    }

    public void withdraw(long amount) throws NotMoneyEnoughException {
        // TODO: if amount is negative - throw IllegalArgumentException
        if(amount < 0) {
            throw new IllegalArgumentException("Amount should be positive");
        }
        // TODO: if amount higher than balance - throw NoManyEnoughException
        if (amount > this.balance) {
            throw new NotMoneyEnoughException("No money");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
