package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of Birth ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth =  scanner.nextInt();
            int age = 2021 - yearOfBirth;

            scanner.nextLine(); // to handle next line

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age <=100 ){
                System.out.println("Your name is: " + name + " you are " + age);

            }else{
                System.out.println("Invalid Value...");
            }
        }else{
            System.out.println("Unable to parse year of Birth");
        }


        scanner.close();
    }
}
