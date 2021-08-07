package com.company;

public class Main {

    public static void main(String[] args) {
        int score = calculateHighScorePosition(1500);
        displayhighScorePosition("Bruno", score);
        score = calculateHighScorePosition(900);
        displayhighScorePosition("tim", score);

    }

    public static int displayhighScorePosition(String name, int position) {
        System.out.println(name + " manege to get into position " + position);
        return position;
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {

            return 1;
        } else if (score > 500 && score < 1000) {

            return 2;
        }else if (score >100 && score <500){

            return 3;
        }else {

            return 4;
        }

    }
}
