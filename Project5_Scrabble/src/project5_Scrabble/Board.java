// import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;

public class Board {
       Scanner scnr = new Scanner(System.in);
       private static final int size = 15;
       private static final char empty = '-';
       private char[][] currentBoard;

       public Board() {
             currentBoard = new char[size][size];
             for (int col = 0; col < size; col++) {
                    for (int row = 0; row < size; row++) {
                         currentBoard[row][col] = empty;
                    }
             }
       }

       public void printBoard() {// GUI board will be implemented

             for (int row = 0; row < size; row++) {
                   System.out.println();
                    for (int col = 0; col < size; col++) {
                    System.out.print(currentBoard[col][row] + " | ");
                    }
             }
       }

       public static int getRow(int location) { // board layout
             return (location - 1) % size;
       }

       public static int getColumn(int location) { // board layout
             return (location - 1) % size;
       }
       
       public void play(char currentPlayer, int location) throws Exception { //Ensures player is entering the number 1-9 and ensures the space they are trying
   		//Implement and throw exception if invalid                       //to play has not been already played
   		if (location < 1 || location > 9) {
   			throw new IllegalArgumentException("Move must be between 1 and 15.");
   		} else if (spaceFilled(getRow(location), getColumn(location))) {
   			throw new IOException("Space has been filled. Choose a new space.");
   		} else {
   			currentBoard[getRow(location)][getColumn(location)] = currentPlayer;
   		}
   	}

       public boolean spaceFilled(int row, int col) { // space availability
             if (currentBoard[row][col] != empty) {
             System.out.println("Location is filled");
                    return true;
             } else
                    return false;
       }

       public boolean boardFull() { // board availability
             boolean fullBoard = false; // initialize
             for (int col = 0; col < size; col++) {
                    for (int row = 0; row < size; row++) {
                           if (spaceFilled(row, col))
                                 fullBoard = true;
                           else
                                 fullBoard = false;
                    }
             }
             return fullBoard;

       }

       public int letterWorth(int row, int col) { // what points are earned from space
             int letterWorth = 1;

             if (row == 1 || row == 8 || row == 15)
                    if (col == 4 || col == 12)
                           letterWorth = 2;

             if (row == 3 || row == 7 || row == 9 || row == 13)
                    if (col == 7 || col == 9)
                           letterWorth = 2;

             if (row == 4 || row == 12) {
                    if (col == 1 || col == 8 || col == 15)
                           letterWorth = 2;
             }

             if (row == 2 || row == 14) {
                    if (col == 6 || col == 10)
                           letterWorth = 3;
             }

             if (row == 6 || row == 10) {
                    if (col == 2 || col == 6 || col == 10 || col == 14)
                           letterWorth = 3;
             }
             return letterWorth;
       }

       public int wordWorth(int row, int col) {
             int wordWorth = 0;

             if ((row == 8 || col == 8) && !(row == 8 && col == 8))
                    wordWorth = 3;

             if ((row == col) && !(row == 8 && col == 8))
                    wordWorth = 2;

             return wordWorth;
       }

}
