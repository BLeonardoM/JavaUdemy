package com.company;

public class Main {

    public static void main(String[] args) {

        double firstVar = 20.00;
        double secondVar = 80.00;

        double addFirstSecond = (firstVar + secondVar) * 100;
        System.out.println(addFirstSecond);

        double remainder = addFirstSecond % 40;
        System.out.println(remainder);

        boolean zeroOrnotremainder = remainder != 0 ? true : false;
        if (zeroOrnotremainder){
            System.out.println("There is a remainder");
        }
    }
}
