package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        double a = scanner.nextInt();
        System.out.print("Введите значение b = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        double b = scanner.nextInt();
        System.out.print("Введите значение c = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        double c = scanner.nextInt();
        double function;
        function = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println("Значение выражения = " + function);
    }
}