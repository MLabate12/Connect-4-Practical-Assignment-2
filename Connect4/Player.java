/* CST8110 - Introduction to Computer Programming
 * Section: 450
 * Semester: 20F
 * Professor: Piyush Jangam
 * Student ID: 41017324
 * Student Email: laba0038@algonquinlive.com
 * Practical Assessment 2
 */

public class Player {

	private String name; //2 private properties, name & token
	private char token;
	
	public Player() {//no-args constructor to initialize the name to Computer and token to the letter O
		name = "Computer";
		token = 'O';
	}
	
	public void setName(String s) {
		name = s;//set user name to user input
		token = 'X';
	}
	
	public String getName() {
		return name; //return player's name
	}
	
	public char getToken() {
		return token; //return player's token
		// return X is player is user, or O if player is computer
	}	
}
