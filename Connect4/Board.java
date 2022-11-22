import java.util.Arrays;

/* CST8110 - Introduction to Computer Programming
 * Section: 450
 * Semester: 20F
 * Professor: Piyush Jangam
 * Student ID: 41017324
 * Student Email: laba0038@algonquinlive.com
 * Practical Assessment 2
 */

public class Board {
	
	private final static int NUM_ROWS = 6; //number of rows on board
	private final static int NUM_COLS = 7; //number of columns on board
	private Column[] board = new Column[NUM_COLS]; //array of column objects which contain token values
	
	public Board() {
		for(int f=0; f<NUM_COLS; f++) { //loop through board array
			board[f] = new Column(); //instantiate & initialize each element as new column
		}
	}
	
	/**
	 * Validate the column number, output an error message and return false if its invalid.
	 * Try to put the token in the specified column of the board. Output an error message and return false if it does not work.
	 * 
	 * @param column The column in which to place the token, valid values are 1 - 7.
	 * @param token Token character to place on the board, an X or an O.
	 * @return True if putting the token on the column is successful, else false.
	 */
	public boolean makeMove(int column, char token) {
		return true;
	}
	
	/**
	 * Checks for Computer's victory by looking for complete vertical and horizontal nibbles.
	 * 
	 * @return True if any nibbles of O's are found on the board, otherwise false.
	 */
	public boolean checkVictory() {
		
		// TODO Loop through each column to check for victory.
		// hint: as soon as any column has a nibble, you can return true and stop checking futher.
		
		
		// TODO: Loop through each row to look for horizontal nibbles
		for (int row = 1; row <= NUM_ROWS; row++) {
			// TODO: Loop through each column in the row to check the value of the column and row.
			// Use a counter to track the number of X's or O's found.
			// hint: you may need to reset the counter to 0 at some point.
			
			
			// TODO: if a nibble is found, return true
			
		}
		
		// return false
		return false;
	}
	
	/**
	 * Checks each column to see if there is room enough for at least 4 more O values.
	 * Checks final row to see if there is room enough for at least 4 O (non-X) values.
	 * @return True if the computer has no more safe moves, else false.
	 */
	public boolean isFull() {
		return true;
	}
	
	/**
	 * Displays each column number, divided by spaces.
	 * Displays, in a grid, the contained in each column of each row.
	 * Displays the column numbers again at the bottom.
	 * Example:
	 *
	 *  1 2 3 4 5 6 7 
	 * ---------------
	 * | | | | | | | |
	 * | | | | | | | |
	 * | | | | | | | |
	 * | | | | | | | |
	 * | |X| | | |O| |
	 * |O|O|X| |X|O| |	 
	 * ---------------
	 *  1 2 3 4 5 6 7 
	 *
	 *
	 */
	public void display() {
		System.out.println();
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("--------------");
		for(int counter=0; counter<(NUM_COLS-1); counter++) {
			String temp = board[counter].toString();
			System.out.print(temp + " | ");
		}
	}
	
}
