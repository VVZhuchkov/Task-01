package com.github.vvzhuchkov;

public class Exercise_7 {
    public static void main(String[] args) {
        double a = 3;
        double b = 5.4;
        double h = 0.3;
        double y;
        double z;

        System.out.println("-----------------------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("-----------------------------------------");

        for (double x = a; x <= b; x = x + h) {
            y = 2*Math.pow(Math.sin(x),2) - Math.pow(Math.cos(x),2);
            System.out.printf("|\t%4.2f\t|\t%4.2f\t|\n", x, y);
        }
        System.out.println("-----------------------------------------");
    }
}
