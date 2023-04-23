package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmountSales(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void shouldFindCountMonthLessAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonth = 7;
        int actualCountMonth = service.countMonthLessAverageAmountSales(sales);

        Assertions.assertEquals(expectedCountMonth, actualCountMonth);


    }

    @Test
    public void shouldFindCountMonthMoreAverageAmountSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonth = 7;
        int actualCountMonth = service.countMonthLessAverageAmountSales(sales);

        Assertions.assertEquals(expectedCountMonth, actualCountMonth);


    }
}
