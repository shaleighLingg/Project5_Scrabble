package project5_Scrabble;

import java.util.Random;
import java.util.ArrayList;
/**
 * 
 * @author LINGGSB19
 *
 */

public class ScrabbleLetter{

	private ArrayList<Character> scrabbleLetters;
	private int max, min;
	
	/**
	 * constructs an array list of characters to be used in the game of scrabble
	 */
	public ScrabbleLetter() {	//Adds letters available  at the beginning of the Game 			
		this.scrabbleLetters = new ArrayList<Character>();
		
		this.max = 99;			//sets the max number of indexes to 99
		this.min = 0;			//sets the minimum number of indexes to 0
		
		for(int i=0; i<2; i++) {
			this.scrabbleLetters.add('B');
			this.scrabbleLetters.add('C');
			this.scrabbleLetters.add('F');
			this.scrabbleLetters.add('H');
			this.scrabbleLetters.add('M');
			this.scrabbleLetters.add('P');
			this.scrabbleLetters.add('V');
			this.scrabbleLetters.add('W');
			this.scrabbleLetters.add('Y');
			this.scrabbleLetters.add('b');
			this.scrabbleLetters.add('O');
			this.scrabbleLetters.add('E');
			this.scrabbleLetters.add('G');
			this.scrabbleLetters.add('A');
			this.scrabbleLetters.add('I');
			this.scrabbleLetters.add('E');
			this.scrabbleLetters.add('N');
			this.scrabbleLetters.add('R');
			this.scrabbleLetters.add('T');
			this.scrabbleLetters.add('O');
			this.scrabbleLetters.add('A');
			this.scrabbleLetters.add('I');
			this.scrabbleLetters.add('E');
		}
		for(int i=0; i<4; i++) {
			this.scrabbleLetters.add('D');
			this.scrabbleLetters.add('L');
			this.scrabbleLetters.add('S');
			this.scrabbleLetters.add('U');
			this.scrabbleLetters.add('N');
			this.scrabbleLetters.add('R');
			this.scrabbleLetters.add('T');
			this.scrabbleLetters.add('O');
			this.scrabbleLetters.add('A');
			this.scrabbleLetters.add('I');
			this.scrabbleLetters.add('E');
		}

		for(int i=0; i<1; i++) {
			this.scrabbleLetters.add('J');
			this.scrabbleLetters.add('K');
			this.scrabbleLetters.add('Q');
			this.scrabbleLetters.add('x');
			this.scrabbleLetters.add('Z');
			this.scrabbleLetters.add('E');
			this.scrabbleLetters.add('G');
			this.scrabbleLetters.add('A');
			this.scrabbleLetters.add('I');
			this.scrabbleLetters.add('E');
		}
	}
	/**
	 * This method gets a random number within the ArrayList's range
	 * @param min, is always 0
	 * @param max, is number of indexes in the ArrayList
	 * @return a random number within the min and max range of indexes
	 */
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
	
	/**
	 * This method gets a letter out of the array list of possible characters
	 * @return a random character
	 */
	public char getLetter() {
		int rand = getRandomNumber(this.min, this.max);		//get a random number in range of arrayListSize()
		char randomLetter = this.scrabbleLetters.get(rand);	//get a letter by returning random index in ArrayList
		this.scrabbleLetters.remove(rand);					//remove the random character
		this.max--;											//decrement the size of the arrayList by one
		return randomLetter;
	}
	/**
	 * This method adds an array of characters back into the ArrayList of 
	 * letter choices
	 * @param lettersToReplace are the current players letters of choice
	 */
	public void replaceLetters(char lettersToReplace[]) {	
		int i=0;											
		while(i<lettersToReplace.length) {					
			this.scrabbleLetters.add(lettersToReplace[i]);	
			this.max++;
			i++;
		}
	}
	/**
	 * This will add back in the current player's letters and return a new array of letter choices
	 * @param lettersToReplace is the character array contains the current players letters
	 * @return a character array of new letter choices
	 */
	public char[] replacePlayersLetters(char lettersToReplace[]) {		
		
		replaceLetters(lettersToReplace);
		int i=0;
		while(i<lettersToReplace.length) {
			lettersToReplace[i]=getLetter();
			i++;
		}
		return lettersToReplace;
	}

}