package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Bruno  ", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(156);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println(("Player " + playerName + " scored " + score + " points "));
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println(("No name player + " + score + " points "));
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) {
            return -1;
        }
        if (inches < 0 || inches > 12) {
            return -1;
        }
        double cm = ((12 * feet + inches) * 2.54);
            System.out.println(feet + " feet and " + inches + " inches are "
                    + cm + " centimeters ");
            return cm;
    }



    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = inches / 12;
        double remainInches = inches % 12;
        System.out.println("There is " + feet + " feet in " + remainInches + " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainInches);
    }
}

