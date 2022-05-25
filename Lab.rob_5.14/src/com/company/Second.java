package com.company;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String a, b, c, d, e;

        Scanner i = new Scanner(System.in);
        System.out.println("The first word: ");
        a = i.nextLine();
        System.out.println("The second word: ");
        b = i.nextLine();
        System.out.println("The third word: ");
        c = i.nextLine();
        System.out.println("The fourth word: ");
        d = i.nextLine();
        System.out.println("The fifth word: ");
        e = i.nextLine();

        System.out.println(a.substring(0,1));
        System.out.println(b.substring(0,1));
        System.out.println(c.substring(0,1));
        System.out.println(d.substring(0,1));
        System.out.println(e.substring(0,1));

    }
}