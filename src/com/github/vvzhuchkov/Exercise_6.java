package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int sum;
        int[] mass = new int[]{first, second, third};
        int min = first;
        int max = first;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        sum = min + max;
        System.out.println("Сумма минимального и максимального числа равна: " + sum);
    }
}
