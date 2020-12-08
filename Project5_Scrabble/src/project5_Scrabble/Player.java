package project5_Scrabble;

public abstract class Player {

	private String name;
	
	//Creates a player and stores data for name, score, and letters to play
	public Player(String name) { 
		this.name = name;
	}
	
	public String getPlayerName() {
		return this.name;
	}


}
