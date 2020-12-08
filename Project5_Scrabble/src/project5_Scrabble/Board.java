package project5_Scrabble;

public class Board {

	private char[][] letterBoard;
	private int[][] scoringBoard;

	public Board() {
		this.letterBoard = new char[15][15];
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				this.letterBoard[i][j] = ' ';
			}
		}
	}

	public void setCharacterAt(char ltr, int row, int col) {
		
		this.letterBoard[row][col] = ltr;
	}

	public char getCharacterAt(int row, int col) {

		return this.letterBoard[row][col];
	}

	public int getScoreValueAt(int row, int col) {
		
		return this.scoringBoard[row][col];
	}
	
	public void printBoard() {
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print("|" + this.letterBoard[i][j]);
			}
			System.out.println("|");
			}
	}

}
