package com.company;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        String a1, a2;
        Scanner i = new Scanner(System.in);

        System.out.println("The first number of the name: ");
        a1 = i.nextLine();

        System.out.println("The second number of the name: ");
        a2 = i.nextLine();

        System.out.println();

        if (a1.equalsIgnoreCase(a2)) {
            System.out.println("Same names");
        } else {
            System.out.println("Different names");
        }
    }
}