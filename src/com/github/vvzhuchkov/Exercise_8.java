package com.github.vvzhuchkov;

public class Exercise_8 {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 6, 7, 9, 10, 16, 67, 81};
        int k = 2;
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % k == 0) {
                sum = sum + mass[i];
            }
        }
        System.out.println(sum);
    }
}
