/* CST8110 - Introduction to Computer Programming
 * Section: 450
 * Semester: 20F
 * Professor: Piyush Jangam
 * Student ID: 41017324
 * Student Email: laba0038@algonquinlive.com
 * Practical Assessment 2
 */
import java.util.Scanner;
import java.util.Random;

public class NibbleNabble {

	private Player currentPlayer;
	private Player computer;
	private Player user;
	private Board board;
	private Scanner input;
	private Scanner input2;
	
	public NibbleNabble() {
		System.out.println("Welcome to NibbleNabble!"); //output welcome message
		System.out.print("Please enter your name: "); //prompt user for their name
		Scanner input = new Scanner(System.in);//initialize scanner
		Player user = new Player();//instantiate new Player
		user.setName(input.nextLine());	//set player name from user input
		Board board = new Board(); 
		Player computer = new Player();//initialize computer
	}
	
	public boolean playGame() {
		while (true) {
			board.display();
			int column = 0;
			currentPlayer = togglePlayer();
			
			System.out.print(currentPlayer.getName() + " > ");
			
			while (column == 0) {
				
				if (currentPlayer == computer) {
					column = new Random().nextInt(7) + 1;
					System.out.println(column);
				} else {
					String move = input.next();
					if (move.toUpperCase().charAt(0) == 'Q')
						return false;
					
					column = Integer.parseInt(move);
				}
				
				if (!board.makeMove(column, currentPlayer.getToken())) {
					column = 0;
				}
				
			}
			
			if (currentPlayer == computer && board.checkVictory()) {
				System.out.println("Oh no! The computer won!");	
				board.display();
				break;
			} else if (currentPlayer == user && board.isFull()) {
				System.out.println("You are victorious!!!");
				board.display();
				break;
			}
		}	
		
		return true;
	}
	
	public boolean quit() {
		board = new Board(); //reinitializes board with new Board object
		System.out.println("Enter Q to quit, or any key to keep playing");
		input2 = new Scanner(System.in);
		String message = input2.nextLine();
		if (message.charAt(0)== 'q' || message.charAt(0)== 'Q') { //if user enters any word beginning with q or Q
			return true;
		} else return false;
	}

	private Player togglePlayer() { //returns computer or user to toggle current player
		if(currentPlayer == user) { 
			return computer;
		} else return user;
	}
}
