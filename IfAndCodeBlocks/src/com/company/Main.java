package com.company;

public class Main {

	public static void main(String[] args) {


		calculateScore(true, 800, 5, 100);

		calculateScore(true, 10000, 8, 200);

	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore +=2000;
			System.out.println("your final Score was " + finalScore);
			return finalScore;
		}else {
			return -1;
		}
	}
	public static int displayHighScorePosition (String name, int position) {
		System.out.println(name + "Manage to get into position" + position);
		return position;
	}
	public static int calculateHighScorePosition () {
		if ()
	}
}
