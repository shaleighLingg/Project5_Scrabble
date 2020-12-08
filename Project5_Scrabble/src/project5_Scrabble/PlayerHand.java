package project5_Scrabble;

public class PlayerHand {

	private char[] hand;

	public PlayerHand(LetterBag currBag) {
		this.hand = new char[7];

		for (int i = 0; i < 7; i++) {
			hand[i] = currBag.getLetter();
		}

	}

	public char[] getHand() {
		return this.hand;
	}

//	public void getMorePiece() {
//		
//	}
//	
//	public void getNewHand() {
//		
//	}

}
