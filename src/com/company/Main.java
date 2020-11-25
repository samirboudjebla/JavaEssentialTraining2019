package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";

        if (s1==s2){
            System.out.println("S1 and S2 match");
        }else{
            System.out.println("S1 and S2 don't match");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        if (s3==s4){
            System.out.println("S3 and S4 match");
        }else{
            System.out.println("S3 and S4 don't match");
        }

        String s5 = new String("Hello!");
        String s6 = new String("Hello!");

        if (s5.equals(s6)){
            System.out.println("S5 and S6 match");
        }else{
            System.out.println("S5 and S6 don't match");
        }

        var s7 = "HELLO!";
        if (s7.equalsIgnoreCase(s3)){
            System.out.println("S7 matches S3");
        }else{
            System.out.println("S7 and S3 don't match");
        }
    }
}
