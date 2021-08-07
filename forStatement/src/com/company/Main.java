package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% = " + calculateInterest(10000, 2));

        // for (init; termination; increment){
    //      }

        for (int i = 0; i < 5; i++){
        System.out.println("Loop " + i + " hello");
        }
        for (int i = 2; i < 9; i ++){
            System.out.println("10000 at " + i + " % = " + calculateInterest(10000, i));
        }
        long var = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                var++;
                System.out.println("Number " + i + " is prime");
                if (var == 3) {
                    System.out.println("exit");
                    break;
                }
            }
        }
        for (int i = 8; i >1; i --){
            System.out.println("");
            System.out.println("10000 at " + i + " % = " + calculateInterest(10000, i));
        }

    }



    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % 1 == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }


}
