//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");// Задача 1
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 2");// Задача 2
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 3");// Задача 3
        for(int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        //По определению, чётное число — целое число, которое делится на 2 без остатка. Ноль полностью удовлетворяет этому определению. Он также обладает всеми свойствами чётных чисел — например, он с обеих сторон граничит с нечётными числами.
        System.out.println();

        System.out.println("Задача 4");// Задача 4
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 5");// Задача 5
        for(int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Задача 6");// Задача 6
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 7");// Задача 7
        for(int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Задача 8");// Задача 8
        int monthMoney = 29000;
        int totalMoney = 0;
        for(int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + monthMoney;
            System.out.println("«Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей»");
        }
        System.out.println();

        System.out.println("Задача 9");// Задача 9
        int monthMoney1 = 29000;
        float totalMoney1 = 0f;
        for(int i = 1; i <= 12; i++) {
            totalMoney1 = totalMoney1 + monthMoney1;
            totalMoney1 = totalMoney1 + totalMoney1 / 100;
            System.out.println("«Месяц " + i + " сумма накоплений равна " + totalMoney1 + " рублей»");
        }
        System.out.println();

        System.out.println("Задача 10");// Задача 10
        int firstMultiplier = 2;
        for(int i = 1; i <= 10; i++) {
            int result = firstMultiplier * i;
            System.out.println(firstMultiplier + " * " + i + " = " + result);
        }
        System.out.println();
    }
}
