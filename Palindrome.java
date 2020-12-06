package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original = scan.nextLine();
        original = original.replace(" ", "");
        original = original.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < original.length()/2; i++) {
            isPalindrome = original.charAt(i) == original.charAt(original.length()-i-1);
        }
        if (isPalindrome) {
            System.out.println("The string you entered is a palindrome");
        }
        else System.out.println("The string you entered is not a palindrome");
        }
    }

