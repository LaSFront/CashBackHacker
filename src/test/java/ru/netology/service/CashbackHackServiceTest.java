package ru.netology.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service;

    @Before
    public void objectBeforeTest() {
        service = new CashbackHackService();
    }

    @Test
    public void amountEqualToBoundary() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void amountLowerThenBoundary() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void amountHigherThenBoundary() {
        assertEquals(999, service.remain(1001));
    }
}
