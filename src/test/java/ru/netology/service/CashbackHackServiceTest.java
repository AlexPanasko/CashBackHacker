package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldBuyPositive() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldBuyZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldBuyLimit() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldBuyMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldBuyMax() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

}
