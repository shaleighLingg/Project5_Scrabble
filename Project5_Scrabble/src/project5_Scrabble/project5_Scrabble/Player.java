package project5_Scrabble;

public abstract class Player {

	public Player() { // player information
		// each player needs their own ArrayList
	}

	public int numPlayers() { // # of players
		return 0;
	}

	public void addPlayer(String newPlayer) { // allows player to be added

	}

	abstract void setPlayerPoints(int playerPoints); // keeps points earned each round
	// going to need to store in an ArrayList

	abstract int playerPieces(int playerPieces); // letters player can use

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
