package com.github.vvzhuchkov;

public class Exercise_10 {
    public static void main(String[] args) {
        int n = 6;
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i = i + 2) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = j + 1;
                mass[n - i - 1][n - j - 1] = j + 1;
            }
        }
        System.out.println("Целевая матрица при n = " + n+":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
