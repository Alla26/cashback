package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void AmountLessThousand() {

        int amount = 950;

        int expected = 50;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void AmountMoreThousand() {

        int amount = 15_600;

        int expected = 400;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void AmountEquallyThousand() {

        int amount = 1_000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}
