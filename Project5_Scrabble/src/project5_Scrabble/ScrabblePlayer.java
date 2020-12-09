package MyScrabbleVersion;

public class ScrabblePlayer extends Player{
	private PlayerScore score;
	private PlayerHand hand;
	
	public ScrabblePlayer(String name, LetterBag fillChar) {
		super(name);
		this.hand = new PlayerHand(fillChar);
		this.score = new PlayerScore();
	}
}
