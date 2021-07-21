package com.mario.junit5app.ejemplo.models;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testConstruct() {
        Account account = new Account("Juan", new BigDecimal("1000.1234"));

        assertEquals("Juan", account.getClient());
        assertEquals(1000.1234, account.getBalance().doubleValue());
    }

    @Test
    void testClientAccount() {
        Account account = new Account();
        account.setClient("Mario");

        assertEquals("Mario", account.getClient());
    }

    @Test
    void testBalanceAccount() {
        Account account = new Account();
        account.setBalance(new BigDecimal("987.345"));

        assertEquals(987.345, account.getBalance().doubleValue());
        assertFalse(account.getBalance().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(account.getBalance().compareTo(BigDecimal.ZERO) > 0);
    }
}