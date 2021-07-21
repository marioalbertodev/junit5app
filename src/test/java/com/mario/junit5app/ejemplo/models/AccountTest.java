package com.mario.junit5app.ejemplo.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void testNameAccount() {
        Account account = new Account();
        account.setClient("Mario");
        String result = account.getClient();

        assertEquals("Mario", result);
    }
}