package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import  org.hamcrest.Matcher.*;
//import  org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0.0);
        //assertThat(account.balance, is(0.0);
    }

    @Test
    public void initialBalanceIsAsSet() {
        Account account = new Account(10.0);
        assertThat(account.balance).isEqualTo(10.0);

    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        // arrange
        Account account = new Account();

        // act
        account.deposit(15.0);

        // assert

        assertThat(account.balance).isEqualTo(15.0);
    }

    @Test
    public void depositMultipleAmountToIncreaseTheBalance() {

        // arrange
        Account account = new Account();

        // act
        account.deposit(15.0);
        account.deposit(20.0);


        // assert

        assertThat(account.balance).isEqualTo(35.0);
    }

    @Test
    public void withdrawAmountToDecreaseTheBalance() {

        Account account = new Account(35.0);

        account.withdraw(15.0);
        assertThat(account.balance).isEqualTo(20.0);

    }

    @Test
    public void depositMultipleAmountFromMultiThreadsToIncreaseTheBalance() {

        // arrange
        Account account = new Account();

        // act
        try {
            for (int i = 0; i < 10; i++) {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        account.deposit(10.0);
                    }
                };
                Thread t = new Thread(r);
                t.start();
            }

            Thread.sleep(2000);

            // assert
            assertThat(account.balance).isEqualTo(100.0);
        } catch (Exception e) {
            assertThat(false);
        }
    }

}
