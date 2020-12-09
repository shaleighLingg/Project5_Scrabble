package project5_Scrabble;


/**
 * This Class creates a hand of letter choices for the player and initializes
 * the players score to 0
 * @author LINGGSB19
 *
 */
public class ScrabblePlayer extends Player{
	private PlayerScore score;
	private PlayerHand hand;
	
	public ScrabblePlayer(String name, LetterBag fillChar) {
		super(name);
		this.hand = new PlayerHand(fillChar);
		this.score = new PlayerScore();
	}
}
