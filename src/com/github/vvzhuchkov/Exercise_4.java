package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координату точки x = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        int x = scanner.nextInt();
        System.out.print("Введите координату точки y = ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
        }
        int y = scanner.nextInt();
        System.out.println("Точка принадлежит закрашенной области?\n " +
                ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)));
    }
}
