package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = scan.nextInt();
        if (input <= 0) {
            System.out.println("Enter the valid number, please.");
        } else {
            while (input != 0) {
                if (input / 50 != 0) {
                    int a = input / 50;
                    input -= a * 50;
                    System.out.println(a + "-50cents");
                } else if (input / 20 != 0) {
                    int b = input / 20;
                    input -= b * 20;
                    System.out.println(b + "-20cents");
                } else if (input / 10 != 0) {
                    int c = input / 10;
                    input -= c * 10;
                    System.out.println(c + "-10cents");
                } else if (input / 5 != 0) {
                    int d = input / 5;
                    input -= d * 5;
                    System.out.println(d + "-5cents");
                } else {
                    int e = input;
                    input -= e;
                    System.out.println(e + "-1cents");
                }
            }
        }
    }
}
