package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainIfAmountLowerThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = service.remain(amount);
        int actual = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIfAmountHigherThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = service.remain(amount);
        int actual = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIfAmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = service.remain(amount);
        int actual = 0;

        assertEquals(actual, expected);
    }
}
