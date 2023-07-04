public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    // Задача 1
    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла" + i);
        }
    }

    // Задача 2
    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация" + i);
        }
    }

    // Задача 3
    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2 + 0) {
            System.out.println("Целые числа" + i);
        }
    }

    // Задача 4
    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Интерация" + i);
        }
    }

    // Задача 5
    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    // Задача 6
    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(" числа последовательности " + i);
        }
    }

    // Задача 7
    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("числа последовательности " + i);
        }
    }

    // Задача 8
    public static void task8() {
        System.out.println("Задача 8");
        int pot = 29000;
        int totalSave = 0;
        for (int i = 1; i <= 12; i++) {
            totalSave = totalSave + pot;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSave + " рублей");
        }
    }

    // Задача 9
    public static void task9() {
        System.out.println("Задача 9");
        int pot = 29000;
        int totalSave = 0;
        for (int i = 1; i <= 12; i++) {
            totalSave = totalSave + pot / 100;
            totalSave = totalSave + pot;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSave + " рублей");
        }
    }

    // Задача 10
    public static void task10() {
        System.out.println("Задача 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            int answer = number * i;
            System.out.println(number + "*" + i + "=" + answer);
        }
    }
}
