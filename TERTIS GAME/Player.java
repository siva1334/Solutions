
import java.util.*;

public class Player {
	
//data of the player.	
 String name;
 int score;
 char[][] board;

//function to get the player details.
void getDetails() {
	
	System.out.println("hi enter your name: ");
	Scanner scan = new Scanner(System.in);
	
	name = scan.next();
	score = 0;
	createBoard();
}

void createBoard() {
	
	board = new char[18][10];
	
	for(int i  = 0; i < 18; i++) {
		board[i][0] = '*';
		board[i][9] = '*';
	}
	
	for(int j = 0; j < 10; j++) {
		board[0][j] = '*';
		board[17][j] = '*';
	}
	
	for(int i = 1; i < 17; i++) {
		for(int j = 1; j < 9; j++) {
			board[i][j] = ' ';
		}
	}
}

void displayBoard() {
	
	for(int i = 0 ; i < 18; i++) {
		for(int j = 0; j < 10; j++) {
			System.out.print(board[i][j] + " ");
		}
		System.out.println();
	}
}

}
