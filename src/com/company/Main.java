package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        double firstValue = scanner.nextDouble();

        System.out.print("Enter the second number :");
        double secondValue = scanner.nextDouble();

        double  sum = firstValue/secondValue;
        System.out.println("The result of the division of is : " +sum);



    }
}
