import java.util.*;
public class Moves {
	Rotations obj;
	Moves(){
		obj = new Rotations();
	}
	
 void move(Player p1, Shape shape) {
	 
		while(true) {
			char c;
			Scanner scan = new Scanner(System.in);
			System.out.println("Rotate Right (E)");
			System.out.println("Rotate Left (Q)");
			System.out.println("Move Left (A)");
			System.out.println("Move Down (S)");
			System.out.println("Move Right (D)");
			System.out.println("Your Move: ");
			c = scan.next().charAt(0);
			
			boolean flag = true;
			
			switch(c) {
			case 'e':   obj.rightRotate(p1,shape);break;
			case 'q':   obj.leftRotate(p1,shape);break;
			case 'a': flag = obj.moveLeft(p1, shape);
						if(flag == false) {
							obj.remove(p1, shape);
							}
						break;
			case 's':  
				flag = obj.moveDown(p1, shape);
				if(flag == false) {
				obj.remove(p1, shape);
				}
				break;
						
			case 'd':  flag = obj.moveRight(p1, shape);
								if(flag == false) {
								obj.remove(p1, shape);
								}
						break;
			}
			
			if(flag == false)break;
			p1.displayBoard();
		}
				
	}
}
