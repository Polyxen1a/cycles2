public class Main {
    public static void main(String[] args) {
        // Лекция
        int salary = 65535;
        int total = 0;
        int i = 1;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i++ + " Итого " + total);
            System.out.println(total);
        }
        // Задание 1
        int monthNumber = 1;
        int sum = 0;
        while (sum < 2_459_000) {
            sum += 15_000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей \n", monthNumber, sum);
            monthNumber++;
        }
        // Задание 2
        System.out.println("Задание 2");
        int i1 = 0;
        while (i1 < 10) {
            i1++;
            System.out.println(i1);
        }
        for (i1 = 10; i1 >= 1; i1--) {
            System.out.println(i1);
        }
// Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17 * population / 1000;
        int deathRate = 8 * population / 1000;
        for (int i3 = 1; i3 <= 10; i3++) {
            population += birthRate;
            population -= deathRate;
            System.out.printf("Год %d, численность %d \n", i3, population);
        }

        // Задание 2.1
        System.out.println("Задание 2.1");
        int sum1 = 15000;
        int monthNum = 1;
        while (sum1 <= 12_000_000) {
            sum1 *= 1.07;
            System.out.printf("Месяц %d, сумма %d \n", monthNum, sum1);
            monthNum++;
        }
        // Задание 2.2
        System.out.println("Задание 2.2");
        int sum2 = 15000;
        int monthNum1 = 1;
        while (sum2 <= 12_000_000) {
            sum2 *= 1.07;
            if (monthNum1 % 6 == 0) {
                System.out.printf("Месяц %d, сумма %d \n", monthNum1, sum2);
                monthNum1++;
            }
        }

        // Задание 2.3
        System.out.println("Задание 2.3");
        int sum3 = 15000;
        for (int i2 = 1; i2 < 9 * 12; i2 += 6) {
            int sumBefore = sum3;
            sum3 *= 1 + 0.07 * 6;
            System.out.printf("Месяц %d, сумма %d \n", i2, sum3 - sumBefore);
        }
        // Задание 2.4
        System.out.println("Задание 2.4");
        int firstFriday = 3;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, "+ currentFriday + "-е число. Необходимо подготовить отчет.");
        }
// Задание 3.1
        System.out.println("Задание 3.1");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i4 = beginning; i4 < ending; ++i4) {
            if (i4 % 79 == 0);
            System.out.println(i4);
        }
// Задание 3.2
        System.out.println("Задание 3.2");
        for (int i5 = 1; i5 < 10; i5++) {
            System.out.println("2 * " + i5 + "=" + 2 * i5);
        }

    }
}