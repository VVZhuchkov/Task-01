package com.github.vvzhuchkov;

public class Exercise_1 {
    public static void main(String[] args) {
        int number = 1221; //заданное четырехзначное число
        int first = number / 1000;
        int second = number / 100 % 10;
        int third = number % 100 / 10;
        int fourth = number % 1000 % 100 % 10;
        System.out.println("Сумма двух первых цифр заданного четырехзначного числа " +
                "равна сумме двух его последних цифр?\n" + (first + second == third + fourth));
    }
}
