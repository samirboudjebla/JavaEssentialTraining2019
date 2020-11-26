package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        var now = LocalDateTime.now();
        var monthNumber = now.getMonthValue();
        String message;


        switch (monthNumber) {
            case 1:
                message = "The month is January";
                break;
            case 2:
                message = "The month is February";
                break;
            case 3:
                message = "The month is March";
                break;
            case 4:
            case 5:
            case 6:
                message = "This is the second Quarter";
                break;
            case 7:
            case 8:
            case 9:
                message = "This the third Quarter";
                break;
            case 10:
            case 11:
            case 12:
                message = "This is the last Quarter";
                break;
            default:
                message = "Choose another month";
        }

        System.out.println(message);

    }
}
