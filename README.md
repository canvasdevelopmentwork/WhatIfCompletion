# WhatIfCompletion

Start with the code below and create a program that will output the sum, product, and average of num1 and num2. 
If the calculated sum is over 200, print an asterisk next to the sum.

import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
    }

}

Bonus: If the calculated sum is under 1000, it should have a tilde (~) printed next to it.
