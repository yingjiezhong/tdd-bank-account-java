package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void initialBalanceCheck() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0.0);

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
}
