package project5_Scrabble;

import java.util.Scanner;

/**
 * This class contains options for each turn
 * 
 * @author LINGGSB19
 *
 */
public class ScrabbleMenu {
	Scanner scnr = new Scanner(System.in);

	/**
	 * This method prints the options for how player wants to carry out next turn
	 */
	public void printOptions() {
		System.out.println("Enter '1' to Place Letter.");
		System.out.println("Enter '2' to put letters back.");
		System.out.println("Enter '3' is to submit word.");
		System.out.println("Enter '4' exchange letters.");
		System.out.println("Enter '5' to end the game.");
	}

	public int getMenuChoice() {
		boolean notValid = true;
		int choice = -1;
		
		while (notValid) {					//prompt until valid answer is received
			choice = scnr.nextInt();
			if (choice >= 1 && choice <= 5) {
				notValid = false;
			} else {
				System.out.println("Not a valid choice./nEnter another option.");
			}
		}
		return choice;
	}

}
