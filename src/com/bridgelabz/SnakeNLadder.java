package com.bridgelabz;

public class SnakeNLadder {
	
	static final int START_POSITION = 0;
	
	static int diceRoll() {
		int x = (int) (1+ Math.random() * 6);
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Snake N Ladder Game");
		
		int roll = diceRoll();
		System.out.println(roll);
	}
}
