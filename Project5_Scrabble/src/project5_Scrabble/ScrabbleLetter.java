package project5_Scrabble;

import java.util.Random;

public class ScrabbleLetter extends Player {

	public ScrabbleLetter() { // letters available at beginning of game

	}

	public int lettersAvailable() { // what letters are left
		return 0;
	}

	public int letterWorth() { // how much each letter is worth
		return 0;
	}

	public Random pieceDraw(Random pieceDraw) { // pieces given to players
		return pieceDraw;
	}

	@Override
	public int playerPieces(int playerPieces) {
		return 0;
	}

	@Override
	void setPlayerPoints(int playerPoints) {

	}
}