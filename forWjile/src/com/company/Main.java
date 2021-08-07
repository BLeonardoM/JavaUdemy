package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 5){
            System.out.println("Count = " + count);
            count ++;
        }
        count =1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("Count Value is " + count);
            count++;
        }
        count =1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int counter = 0;
        int sumNumber = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                counter ++;
                sumNumber ++;
                continue;

            }if (counter >= 5){
                break;

            }
            System.out.println("Even number " + number);

            System.out.println("Number of even numbers = " + sumNumber);
        }

    }

    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
}
