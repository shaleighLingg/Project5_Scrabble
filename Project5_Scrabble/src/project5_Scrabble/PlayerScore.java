package project5_Scrabble;
/**
 * This Class will calculate a new player score
 * @author LINGGSB19
 *
 */
public class PlayerScore {

	private int score;
	
	public PlayerScore() {
		this.score =0;
	}
	
	public void setScore(int points) {
		
		this.score += points;
	}
	
	public int getScore() {
		return this.score;
	}
}
