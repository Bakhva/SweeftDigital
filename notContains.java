package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int length = scan.nextInt();
        System.out.println("Enter the elements: ");
        int[] array = new int[length];
        for(int i=0; i < length; i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        int value = 1;
        for(int i = 0; i < length; i++){
            if(array[i] <= 0){
                value = 1;
            }
            else if (array[i] > value) {
                value = 1;
            }
            else if (array[i] == value) {
                value++;
            }
        }
        System.out.println(value);
    }
}
