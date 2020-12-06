package project5_Scrabble;

import java.io.IOException;
import java.util.Scanner;

public class Board {
	Scanner scnr = new Scanner(System.in);
	private static final int size = 3;
	private static final char empty = ' ';
	private char[][] currentBoard; 
	
	public Board(int row, int location, int col) {
		
	}
	
	public void printBoard() { //GUI board will be implemented
		
	}
	
	public int getLocation() { //players location
		return 0;
	}
	
	public static int getRow() { //board layout
		return 0;
	} 
	
	public static int getColumn() { //board layout
		return 0;
	}
	
	public boolean spaceFilled(int row, int col) { //space availability
		return false; 
	}
	
	public void wordsOnBoard(char letter, int numLetters) { //what words/letters are currently on board
		
	}
	
	public boolean boardFull() { //board availability
		return false;
	}
	
	public int spaceWorth(int row, int col) { //what points are earned from space
		return 0;
	}
}
