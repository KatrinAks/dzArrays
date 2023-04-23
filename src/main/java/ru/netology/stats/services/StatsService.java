package ru.netology.stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int amountSales(long[] sales) {
        int amountSales = 0; // сумма продаж всех продаж

        for (int i = 0; i < sales.length; i++) {
            amountSales += sales[i];

        }

        return amountSales;
    }

    public int averageAmountSales(long[] sales) {
        int averageAmountSales = 0;

        for (int i = 0; i < sales.length; i++) {
            averageAmountSales += sales[i];
        }


        return averageAmountSales / sales.length;
    }

    public int countMonthLessAverageAmountSales(long[] sales) {
        int averageAmountSales = 15;
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= averageAmountSales) {
                countMonth++;
            }
        }
        return countMonth;

    }

    public int countMonthMoreAverageAmountSales(long[] sales) {
        int averageAmountSales = 15;
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageAmountSales) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
