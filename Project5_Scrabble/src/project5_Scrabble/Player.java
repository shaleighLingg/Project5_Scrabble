package project5_Scrabble;

/**
 * This class holds the player's name
 * @author LINGGSB19
 *
 */

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
