package com.company;

public class Main {

    public static void main(String[] args) {

        long sum = 0;
        long var = 0;

        for (long i = 1; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {

                System.out.println("Number " + i + " is Divisible by 3 and 5");

                var++;

                sum += i;

                if (var == 5) {


                    System.out.println("exit");

                    break;
                }
            }

        }
        System.out.println("The sum of the numbers is " + sum);
    }

}
