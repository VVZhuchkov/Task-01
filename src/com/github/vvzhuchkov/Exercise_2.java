package com.github.vvzhuchkov;

public class Exercise_2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1;
        double c = 2;
        double function;
        function = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println(function);
    }
}