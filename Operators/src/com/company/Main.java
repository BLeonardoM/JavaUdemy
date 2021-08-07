package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println( "1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResolt = " + previousResult);
        result = result - 1;
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result /5 ;

        result = result % 3; // The remainder of (4 % 3) = 1
        System.out.println(result);

        // result = result +1;
        result++; // 1 + 1 = 2 / ++ will add 1
        System.out.println(result);

        result--; // -- will take 1
        System.out.println(result);

        result += 2; // +=2 will add 2.
        System.out.println(result);

        result *= 10; // now *= 10 will multiply by 10, the seult will be 30.
        System.out.println("3 * 10 = " + result);

        result /= 3; // /= 3 will divide by 3.
        System.out.println("30 / 3 = " + result);

        result -= 2; // -= will decrease 2.
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien");
            System.out.println("I am scare of Aliens");
        }

        int topSocre = 80;
        if (topSocre < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topSocre > secondTopScore) && (topSocre < 100)){ // is checking  if topscore is greater than secondTopScore AND topScore is less than 100
            System.out.println("Greather than second top score and less than 100");
        }
        if ((topSocre > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not suppose to happen");

        }

        isCar =true;
        boolean wasCar = (isCar) ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

    }
}
