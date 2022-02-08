package com.github.vvzhuchkov;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число");
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            number = scanner.nextInt();
                  }

//        scanner.nextLine();
//        number = scanner.nextInt();
//        if (number < 10000 && number > 999) {
//            break;
//        } else
//            System.out.println("Вы ввели неверное число! Попробуйте снова.");
//    }
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number % 100 / 10;
        int fourth = number % 1000 % 100 % 10;
        System.out.println(first + second == third + fourth);
    }
}
