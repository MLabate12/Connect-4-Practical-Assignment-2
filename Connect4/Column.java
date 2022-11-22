/* CST8110 - Introduction to Computer Programming
 * Section: 450
 * Semester: 20F
 * Professor: Piyush Jangam
 * Student ID: 41017324
 * Student Email: laba0038@algonquinlive.com
 * Practical Assessment 2
 */

public class Column {//this class is a single column on the board, containing vertically stacked X and O tokens

	private static final int MAX_HEIGHT = 6;
	private int height = 0;
	private char[] columnArray = new char[MAX_HEIGHT-1]; //declare & initialize char array

	public Column() {
		for (int c=0; c<=MAX_HEIGHT; c++) {
			columnArray[0] = 'C'; //initialize each element in column to contain blank space
		}
	}
	
	public char get(int row) { //return the value in the specified row
		if (columnArray[row]==0) {
			return 0; //return blank
		} else {
			return columnArray[row+1]; //return character in row+1 (for valid values of 1-6)
		}
	}
	
	/** Put the specified token character at the top of the column, increments the height, and returns true.
	 * 
	 * @param token Token character to place on the board, an X or an O.
	 * @return True if there is room in the column for the token, else false.
	 */
	public boolean put(char token) {
		int d=0;
		while(d<=MAX_HEIGHT) {
			if (columnArray[d]==0) { //if space in array is empty
				columnArray[d]=token;
				d++;
				return true;
			} else return false;
		}
	}
	
	/**
	 * Check if the column contains a Nibble.
	 * 
	 * @return True if the column contains 4 or more consecutive 'O' tokens, else false.
	 */
	public boolean checkVictory() {
		return false;
	}
	
	/**
	 * Returns the current height of the Column.
	 * @return the height of the column
	 */
	public int getHeight() {
		return 12;
	}
}
