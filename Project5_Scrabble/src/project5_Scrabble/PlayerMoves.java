package project5_Scrabble;

import java.util.Random;

public class PlayerMoves extends Player {

	public PlayerMoves() { // players moves

	}

	public void setPlayerLocation(int playerLocation) { // holds each players location
		// might need to be an arraylist
	}

	public Random addPieces(Random piece) { // distributes pieces to player
		return piece;
	}

	public void nextPlayer() { // players turn

	}

	public boolean validWord(String playersWord) { // player move correct
		// use a list linkedList to take out a word if incorrect
		return true;
	}

	public int moreLetters() { // replenishes used letters
		return 0;
	}

	@Override
	void setPlayerPoints(int playerPoints) {

	}

	@Override
	public int playerPieces(int playerPieces) {
		return 0;
	}

	public int getPlayerPoints() { // updates the players points
		return 0;
	}

	public void gameRules() { // what moves are valid

	}

	public boolean hasWon(String player) { // winning player
		// when game ends, use Map hashMap to print out 1st-4th place along with name
		// and score
		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
