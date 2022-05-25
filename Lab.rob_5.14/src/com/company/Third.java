package com.company;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("Three fractional numbers: ");
        Scanner i = new Scanner(System.in);
        System.out.print("The first number : ");

        if (i.hasNextDouble()) {
            a = i.nextDouble();
            System.out.println("The second number: ");
            b = i.nextDouble();
            System.out.println("The third number: ");
            c = i.nextDouble();
            System.out.println();

            if (a > b && a > c) {
                System.out.println(a + " - Max fractional numbers");
            } else if (b > a && b > c) {
                System.out.println(b + " - Max fractional numbers");
            } else if (c > a && c > b) {
                System.out.println(c + " - Max fractional numbers");
            } else {
                System.out.println("The isn`t largest fractional number ((");
            }
        } else {
            System.out.println("It`s not a fractional number");
        }

    }

}