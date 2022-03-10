
import java.util.*;

public class RunTheGame {
	
Moves m;

RunTheGame(){
	m = new Moves();
}

String shapes[] = new String[] {
"L","S","T","Z","I", "SQ", "ML","L","I", "I", "T", "Z", "ML", "I", "S", "SQ", "Z",
"S","I","ML", "I", "S", "T", "SQ", "T", "I", "L", "S","ML", "SQ","ML","ML","I","T","I","ML"
};


void start(Player p1) {
	
	int n = shapes.length;
	int index = 0;
	
	while(true) {
		Shape shape = new Shape();
		index %= n;
		boolean flag = shape.spawn(p1, shapes[index++]);
		p1.displayBoard();
		
		if(flag == false) {
			System.out.println("...GAME OVER...");
			System.out.println(p1.name + " scored " + p1.score + " points");
			break;
		}		
		 m.move(p1, shape);					
	}
}

}
