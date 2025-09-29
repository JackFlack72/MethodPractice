package com.pluralsight;
import java.util.*;

public class CompareNumbers {
    public static void main(String[] args) {
        isEven(4);
        isPositive(4);
    }

    public static void isEven(int number){
        if (number%2 == 0){
            System.out.println("It's an even number!");
        }
        else {
            System.out.println("It's an odd number!");
        }
    }

    public static void isPositive(double number){
        if (number > 0){
            System.out.println("It's a positive number!");
        }
        else {
            System.out.println("It's a negative number!");
        }
    }
}
