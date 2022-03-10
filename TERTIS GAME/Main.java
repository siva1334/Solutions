import java.util.*;

public class Main {
	 
	
public static void main(String []args ) {

	Scanner scan = new Scanner(System.in);
	Player p1 = new Player();
	
	p1.getDetails();
	p1.displayBoard();
	System.out.println("HI " + p1.name );
	System.out.println("LET'S PLAY TERTIS");
	System.out.println("Enter any key to start the game: ");
	scan.next();
	
	
	RunTheGame tertis = new RunTheGame();
	tertis.start(p1);
	
	scan.close();
}

}
