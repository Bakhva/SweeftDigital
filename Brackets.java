package com.company;

import java.util.*;

public class Main {

    static boolean isProperly(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            if (x == ')') {
                stack.pop();
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sequence of brackets");
        String brackets = scan.nextLine();
        if (isProperly(brackets))
            System.out.println("The string is balanced ");
        else {
            System.out.println("The string is not Balanced ");
        }
    }
}
