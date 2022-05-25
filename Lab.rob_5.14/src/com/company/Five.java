package com.company;
import java.util.Scanner;

public class Five{
    public static void main(String[] args) {
        String a1, a2;
        Scanner i = new Scanner(System.in);

        System.out.println("First line: ");
        a1 = i.nextLine();

        System.out.println("Second line: ");
        a2 = i.nextLine();

        System.out.println();

        if (a1.length() > a2.length()) {
            System.out.println("The largest line: " + a1);
        }else {
            System.out.println("The largets line: " + a2);
        }
    }
}