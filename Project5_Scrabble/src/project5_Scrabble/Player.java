package project5_Scrabble;

public class Player {

	private int score;
	private char[] letters;
	private String name;
	
	//Creates a player and stores data for name, score, and letters to play
	public Player(String name, ScrabbleLetter fillChar) { 
		this.score = 0;
		this.name = name;
		this.letters = new char[7];
		for(int i=0; i<7; i++) {
		this.letters[i] = fillChar.getLetter();
		}
	}
	
	public String getPlayerName() {
		return this.name;
	}
	public int getPlayerScore() {
		return this.score;
	}
	public char[] getPlayersLetterChoices() {
		return this.letters;
	}

}
