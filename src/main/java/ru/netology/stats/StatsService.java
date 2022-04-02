package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {  //расчет суммы всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverageSum(int[] sales) {  //расчет средней суммы продаж в месяц
        int sum = calculateSum(sales);
        int averageSum = sum / sales.length;
        return averageSum;

    }

    public int maxSales(int[] sales) {  //расчет номера месяца с максимальными продажами
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {  //расчет номера месяца с минимальными продажами
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(int[] sales) {  //расчет количества месяцев с продажами ниже среднего
        int averageSum = findAverageSum(sales);
        int numberBelowAverage = 0;
        for (int sale : sales) {
            if (sale < averageSum) {
                numberBelowAverage += 1;
            }
        }
        return numberBelowAverage;

    }

    public int salesAboveAverage(int[] sales) {  //расчет количества месяцев с продажами выше среднего
        int averageSum = findAverageSum(sales);
        int numberAboveAverage = 0;
        for (int sale : sales) {
            if (sale > averageSum) {
                numberAboveAverage += 1;
            }
        }
        return numberAboveAverage;

    }
}












