package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int[] mass = new int[]{first, second, third};
        for (int i = 0; i < mass.length;i++){
            if (mass[i]>=0) {
                mass[i] = (int)Math.pow(mass[i],2);
            }
            else {
                mass[i] = (int)Math.pow(mass[i],4);
            }
            System.out.println(mass[i]);
        }
    }
}
