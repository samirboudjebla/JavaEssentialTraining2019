package com.company;

public class Main {

    public static void main(String[] args) {
        var s1 = "Welcome to California!";
        System.out.println("length of the string is :" + s1.length());

        int position = s1.indexOf("California");
        System.out.println("position of California in the string is: "+position);

        var sub = s1.substring(11);
        System.out.println("SubString at the position 11 is : "+ sub);

        String s2 = "Welcome!             ";
        var len = s2.length();
        System.out.println("length of Welcome! String is: "+len);

        var trimmed = s2.trim();
        System.out.println("Strimmed String is : "+ trimmed+ " and it's length is: "+trimmed.length());

    }
}
