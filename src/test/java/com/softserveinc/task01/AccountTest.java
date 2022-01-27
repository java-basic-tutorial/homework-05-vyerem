package com.softserveinc.task01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    void init() {
        account = new Account(1000);
    }

    @Test
    void depositWithNegativeAmount() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-1));
    }

    @Test
    void withdrawNegativeAmount() throws ClassNotFoundException {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(-1));
    }

    @Test
    void withdrawMoreManyThanExists() throws ClassNotFoundException {
        Assertions.assertEquals(1000, account.getBalance());
        Class aClass = Class.forName("com.softserveinc.task01.NotMoneyEnoughException");
        Assertions.assertThrows(aClass,
                () -> account.withdraw(1001));
    }
}