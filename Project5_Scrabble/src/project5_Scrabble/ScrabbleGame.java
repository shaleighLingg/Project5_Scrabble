package project5_Scrabble;

import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleGame {
	
	private Board gameBoard;
	private Scanner sc;
	private ArrayList<ScrabblePlayer> playerList;
	private boolean loop;
	private LetterBag gameBag;
	
	public ScrabbleGame(){
		
		this.loop = true;
		this.playerList = new ArrayList<>();
		this.sc = new Scanner(System.in);
		this.gameBoard = new Board();
		this.gameBag = new LetterBag();
	}
	
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
	
	public void playLoop() {
		
		addPlayers();								 //add players to game
		while(loop) {								 //plays game
			this.gameBoard.printBoard();			
			//input to "quit"
			String quit = sc.nextLine();
			if(quit.equals("quit")) {
				loop = false;
				System.out.println("End Game.");
			}
	}
		
	}
}
