package com.company;
import java.util.*;

public class Main {
    static int countVariants (int stairsCount) {
        if (stairsCount == 0)
            return 0;
        else if (stairsCount == 1)
            return 1;
        else if (stairsCount == 2)
            return 2;
        return countVariants(stairsCount-1) + countVariants(stairsCount-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = s.nextInt();
        System.out.println("The calculated variants are: "+countVariants(n));
    }
}
