package com.github.vvzhuchkov;

public class Exercise_9 {
    public static void main(String[] args) {
        int[] mass1 = new int[]{1, 2, 3, 4, 5};
        int[] mass2 = new int[]{6, 7};
        int[] newMass = new int[mass1.length + mass2.length];
        int k = 3;
        for (int i = 0; i <= k; i++) {
            newMass[i] = mass1[i];
        }
        for (int i = 0; i < mass2.length; i++) {
            newMass[k + 1 + i] = mass2[i];
        }
        for (int i = k + 1; i < mass1.length; i++) {
            newMass[i+mass2.length] = mass1[i];
        }
        for (int i = 0; i < newMass.length; i++) {
            System.out.print(newMass[i] + " ");
        }
    }
}


//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
//     Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.