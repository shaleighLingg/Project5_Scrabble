package project5_Scrabble;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
/**
 * This class adds new players to the Game, loops through each the players and prompts for options
 * calling the menu class for the player's turn and quits the game when
 * the scrabble rules determine it is over or when the user requests to stop game
 * @author LINGGSB19
 *
 */

public class ScrabbleGame {
	
	private Board gameBoard;
	private Scanner sc;
	private Queue<ScrabblePlayer> playerList;
	private boolean loop;
	private LetterBag gameBag;
	private ScrabbleMenu menu;
	
	public ScrabbleGame(){
		
		this.loop = true;
		this.playerList = new LinkedList<>();
		this.sc = new Scanner(System.in);
		this.gameBoard = new Board();
		this.gameBag = new LetterBag();
		this.menu = new ScrabbleMenu();
	}
	
	/**
	 * prompts the user for player names, will add 2-4 players
	 */
	
	public void addPlayers() {										//Adds Players to the Game
		
		boolean addPlayer = true;
		
		System.out.println("Enter player name: ");					//Prompts user for names
		while(addPlayer) {
			String name = sc.nextLine();
			this.playerList.add(new ScrabblePlayer(name, this.gameBag));
			
		if(playerList.size()>=2 && playerList.size()<4) {
			System.out.println("Would you like to enter another player? Enter Yes of No?");
			String opt = sc.nextLine();
			if(opt.equals("No")) {
				addPlayer = false;
			}
			else {
				System.out.println("Add next player:");
			}
		}
		else if(playerList.size()==4) {
			addPlayer = false;
		}
		else{
			System.out.println("Add next player:");
		}
		}
		
	}
	/**
	 * method will loop through each player's turn
	 * each turn the player will be prompted to chose a menu option
	 * the loop will exit based upon scrabble game conditions when the user wants to end game
	 */
	
	public void playLoop() {
		ScrabblePlayer player;
		addPlayers();								 //add players to game
		while(loop) {
			
			player = playerList.remove();							//gets the next player
			System.out.println(player.getPlayerName());				//print name
			
			this.gameBoard.printBoard();	
			
			menu.printOptions();
			
			int choice = menu.getMenuChoice();		//get move choice
			playerList.add(player);					//add current player to last position
			
//			if(quit.equals("quit")) {
//				loop = false;
//				System.out.println("End Game.");
//			}
	}
		
	}
}
