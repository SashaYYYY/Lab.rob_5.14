package com.company;

import java.util.Scanner;

public class First {
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
        System.out.println();

        String x  = a.concat(" ").concat(b).concat(" ").concat(c).concat(" ").concat(d).concat(" ").concat(e).concat(".");
        System.out.println(x);
    }
}
