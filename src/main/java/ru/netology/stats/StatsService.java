package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAvg(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int currentMonth = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = currentMonth;
            }
            currentMonth++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int currentMonth = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = currentMonth;
            }
            currentMonth++; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateMonthsBelowAvg(long[] sales) {
        long avg = calculateAvg(sales);
        int monthsBelowAvg = 0;
        for (long sale : sales) {
            if (sale < avg) {
                monthsBelowAvg++;
            }
        }
        return monthsBelowAvg;
    }

    public int calculateMonthsAboveAvg(long[] sales) {
        long avg = calculateAvg(sales);
        int monthsAboveAvg = 0;
        for (long sale : sales) {
            if (sale > avg) {
                monthsAboveAvg++;
            }
        }
        return monthsAboveAvg;
    }
}
