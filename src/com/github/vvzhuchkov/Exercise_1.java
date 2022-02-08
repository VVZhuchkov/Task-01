package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        int number;
        System.out.println("Введите положительное четырехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt() || ((number = scanner.nextInt()) < 1000 || number > 9999)) {
            System.out.println("Некорректный ввод! Попробуйте снова.");
            scanner.nextLine();
        }
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number % 100 / 10;
        int fourth = number % 1000 % 100 % 10;
        System.out.println("Заданное четырехзначное число - " + number);
        System.out.println("Сумма двух первых цифр заданного четырехзначного числа " +
                "равна сумме двух его последних цифр?\n" + (first + second == third + fourth));
    }
}
