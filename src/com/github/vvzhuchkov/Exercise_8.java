package com.github.vvzhuchkov;

public class Exercise_8 {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 3, 6, 7, 9, 10, 16, 67, 81};
        int k = 9;
        int sum = 0;
        for (int j : mass) {
            if (j % k == 0) {
                sum = sum + j;
            }
        }
        System.out.println("Сумма элементов кратных k = " + sum);
    }
}
