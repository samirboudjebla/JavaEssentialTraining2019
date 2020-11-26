package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        var monthNumber = scanner.nextInt();

        String message;
        if (monthNumber<1 || monthNumber>12){
            message = "please enter a valid month!";
        }else {
            if (monthNumber<=3){
                message = "First Quarter";
            }else{
                if (monthNumber<=6){
                    message = "Second Quarter";
                }else{
                    if (monthNumber<=9){
                        message = "Third Quarter";
                    }else{
                        message = "Fourth Quarter";
                    }
                }
            }
        }
        System.out.println(message);

    }
}
