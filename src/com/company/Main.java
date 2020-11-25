package com.company;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number Format: "+ numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer Format: "+ intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Integer Format: "+ intF.format(doubleValue));


    }
}
