package com.github.vvzhuchkov;

public class Exercise_3 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double perimeter;
        double square;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        perimeter = a + b + c;
        square = 0.5 * a * b;
        System.out.println(perimeter);
        System.out.println(square);
    }
}
