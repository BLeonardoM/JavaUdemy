package com.company;

public class Main {

    public static void main(String[] args) {
        int digits = sumDigits(125);
        System.out.println(digits);

    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int takeDigit = 0;
        int sum = 0;
        while (number >0){
            takeDigit = number % 10;
            sum += takeDigit;
            number /= 10;

        }return sum;

    }
}
