package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        double perimeter;
        double square;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину катета a = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        double a = scanner.nextInt();
        System.out.print("Введите длину катета b = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        double b = scanner.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        perimeter = a + b + c;
        square = 0.5 * a * b;
        System.out.println("Периметр = " + perimeter);
        System.out.println("Площадь = " + square);
    }
}
