package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    //@Disabled
    public void initialBalanceCheck() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0.0);

    }

}
