package project5_Scrabble;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlayerMoves extends Player {
	Scanner scnr = new Scanner(System.in);
	private Board gameBoard;
	private boolean run;
	private boolean error;
	private int location;
	private char playAgain;
	private String playerMoves;
	private ArrayList<Character> piece = new ArrayList<>();
	private char[] pieces = new char[8];
	private Map<String, char[]> playerLetters = new HashMap<String, char[]>();
	private Map<String, Integer> playerPoints = new HashMap<String, Integer>();
	private Board fullBoard;
	private char currentPlayer;

	public PlayerMoves() { // players moves
		gameBoard = new Board();
		currentPlayer = '1';
		run = true;
		location = 0;
		error = true;
	}

	public void gameLoop() {
		while (run) { // Continuously changes the player while the game is being played
			gameBoard.printBoard(); // Prints the board
			System.out.println("");
			error = true;
			while (error) { // Allows the player to reenter their move if space is filled or they had
							// entered an incorrect number
				try {
					System.out.println("Player " + currentPlayer + ": ");
					// Assures player does not enter anything other that a letter
					while (!scnr.hasNext()) {
						scnr.next();
						if (scnr.hasNextInt()) {
							System.out.println("Input must be a letter.");
							System.out.println("");
							System.out.println("Player " + currentPlayer + ": ");
						}
						if (!scnr.hasNext()) {
							System.out.println("Input must be a letter.");
							System.out.println("");
							System.out.println("Player " + currentPlayer + ": ");
						}
					}
					gameBoard.play(currentPlayer, scnr.nextInt());
					error = false;

				} catch (Exception o) {
					System.out.println(o.getMessage()); // Catches anything that may be wrong
					System.out.println("");
					error = true;
				}
			}
			// Ensures that player changes every time the loop iterates
//			int numPlayers = 4;
			
			// if there are 4 players
//			while (numPlayers == 4) {
//				if (currentPlayer == '1') {
//					currentPlayer = '2';
//				} else if (currentPlayer == '2') {
//					currentPlayer = '3';
//				} else if (currentPlayer == '3') {
//					currentPlayer = '4';
//				} else {
//					currentPlayer = '1';
//				}
//			}
			// if there are 3 players
//			while (numPlayers == 3) {
//				if (currentPlayer == '1') {
//					currentPlayer = '2';
//				} else if (currentPlayer == '2') {
//					currentPlayer = '3';
//				} else {
//					currentPlayer = '1';
//				}
//			}
			// if there are 2 players
//			while (numPlayers == 2) {
//				if (currentPlayer == '1') {
//					currentPlayer = '2';
//				} else {
//					currentPlayer = '1';
//				}
//			}
//		}

	}

	public Random addPieces(Random piece) { // distributes pieces to player
		piece = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz ";
		int totalPieces = 7; // each player will get 7 pieces
		// player 1 letters
		if (currentPlayer == '1') {
			playerLetters.put("Player one's letters", pieces);
			for (int i = 0; i < totalPieces; i++) {
				pieces[i] = letters.charAt(piece.nextInt(letters.length()));
				System.out.print(pieces[i] + " ");
			}
		}
		// player 2 letters
		if (currentPlayer == '2') {
			playerLetters.put("Player two's letters", pieces);
			for (int i = 0; i < totalPieces; i++) {
				pieces[i] = letters.charAt(piece.nextInt(letters.length()));
				System.out.print(pieces[i] + " ");
			}
		}
		// player 3 letters
		if (currentPlayer == '3') {
			playerLetters.put("Player three's letters", pieces);
			for (int i = 0; i < totalPieces; i++) {
				pieces[i] = letters.charAt(piece.nextInt(letters.length()));
				System.out.print(pieces[i] + " ");
			}
		}
		// player 4 letters
		if (currentPlayer == '4') {
			playerLetters.put("Player four's letters", pieces);
			for (int i = 0; i < totalPieces; i++) {
				pieces[i] = letters.charAt(piece.nextInt(letters.length()));
				System.out.print(pieces[i] + " ");
			}
		}
		for(Map.Entry<String, char[]> l : playerLetters.entrySet()) {
			System.out.println(l.getKey() + " : " + l.getValue());
		}
		return piece;
	}

	public boolean validWord(String playersWord) { // player move correct
		// use a list linkedList to take out a word if incorrect
		playersWord = "";
		return true;
	}

	@Override
	void setPlayerPoints(int points) {
		points = 0;
		Board words;
		while (currentPlayer == '1') {
			points = words.wordWorth(row, col); // not sure whether I should use letterWorth or wordWorth
			playerPoints.put("Player one's points", new Integer(points));
		}
		while (currentPlayer == '2') {
			points = words.wordWorth(row, col);
			playerPoints.put("Player two's points", new Integer(points));
		}
		while (currentPlayer == '3') {
			points = words.wordWorth(row, col);
			playerPoints.put("Player three's points", new Integer(points));
		}
		while (currentPlayer == '4') {
			points = words.wordWorth(row, col);
			playerPoints.put("Player four's points", new Integer(points));
		}

		for (Map.Entry<String, Integer> pointsEarned : playerPoints.entrySet()) {
			System.out.println(pointsEarned.getKey() + " : " + pointsEarned.getValue());
		}
	}

	public boolean hasWon(String player) { // winning player
		// when game ends, use Map hashMap to print out 1st-4th place along with name
		// and score
		while (fullBoard.boardFull()) {
			int[] winningScore = { 34, 53, 83, 03 };

			int firstPlace = winningScore[0];
			// First place
			for (int i = 0; i < winningScore.length; i++) {
				if (winningScore[i] > firstPlace) {
					firstPlace = winningScore[i];
				}
				System.out.println(firstPlace + " is in first place!");
			}

			int fourthPlace = winningScore[0];
			// makes sure there is a fourth player
			if (winningScore.length > 3) {
				// Fourth place
				for (int j = 0; j < winningScore.length; j++) {
					if (winningScore[j] < fourthPlace) {
						fourthPlace = winningScore[j];
					}
					System.out.println(fourthPlace + " is in fourth place!");
					return true;
				}
			}

			int secondPlace = winningScore[0];
			// Second Place
			for (int k = 0; k < winningScore.length; k++) {
				if (winningScore[k] <= firstPlace && winningScore[k] >= fourthPlace) {
					int place = winningScore[k];
					if (winningScore[k] > place) {
						secondPlace = winningScore[k];
					}
				}
				System.out.println(secondPlace + " is in second place!");
			}

			int thirdPlace = winningScore[0];
			// makes sure there are three players
			if (winningScore.length > 2) {
				// if there are four players
				if (winningScore.length == 4) {
					// Third Place
					for (int l = 0; l < winningScore.length; l++) {
						if (winningScore[l] <= secondPlace && winningScore[l] >= fourthPlace) {
							thirdPlace = winningScore[l];
						}
						System.out.println(secondPlace + " is in second place!");
					}
				}
				// if there are only three players
				else if (winningScore.length == 3) {
					for (int m = 0; m < winningScore.length; m++) {
						if (winningScore[m] < thirdPlace) {
							thirdPlace = winningScore[m];
						}
					}
				}
			}

			// Checks for ties
			if (secondPlace == firstPlace) {
				System.out.println("There has been a tie for first place!");
				return true;
			}
			if (thirdPlace == secondPlace) {
				System.out.println("There has been a tie for second place!");
				return true;
			}
			if (fourthPlace == thirdPlace) {
				System.out.println("There has been a tie for third place!");
				return true;
			}
			if (firstPlace == secondPlace && firstPlace == thirdPlace && firstPlace == fourthPlace) {
				System.out.println("There has been an overall tie amongst the players!");
				return true;
			}
			if (secondPlace == thirdPlace && secondPlace == fourthPlace) {
				System.out.println("There has been a tie among players 2-4!");
				return true;
			}
			if (firstPlace == secondPlace && firstPlace == thirdPlace) {
				System.out.println("There has been a tie among players 1-3!");
				return true;
			}
		}
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PlayerMoves)) {
			return false;
		}

		PlayerMoves other = (PlayerMoves) obj;
		return (playerMoves == other.playerMoves);
	}

	@Override
	int playerPieces(int playerPieces) {
		// TODO Auto-generated method stub
		return 0;
	}

}
