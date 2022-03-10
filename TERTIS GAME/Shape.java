


public class Shape {
	
private char [][] temp;
int startRow;
int startCol;
int row;
int col;

Shape() {
	temp = new char[3][3];
}

boolean spawn(Player p1, String shape) {
	int asci = 0;
	
	for(int i = 0; i < shape.length();i++)
		asci += (int)shape.charAt(i);
	
	switch(asci) {
	
	case (int)'S':
		temp[0][1] = '*';
		temp[0][2] = '*';
		temp[1][0] = '*';
		temp[1][1] = '*';
		row = 2;
		col = 3;
		startRow = 1;
		startCol = 4;
		break;
		
	case (int)'L':
		temp[0][0] = '*';
		temp[1][0] = '*';
		temp[2][0] = '*';
		temp[2][1] = '*';
		row = 3;
		col = 2;
		startRow = 1;
		startCol = 4;
		break;
		
	case (int)'T':
		temp[0][0] = '*';
		temp[0][1] = '*';
		temp[0][2] = '*';
		temp[1][1] = '*';
		temp[2][1] = '*';
		row = 3;
		col = 3;
		startRow = 1;
		startCol = 4;
		break;
		
	case (int)'Z':
		temp[0][0] = '*';
		temp[0][1] = '*';
		temp[1][1] = '*';
		temp[1][2] = '*';
		row = 2;
		col = 3;
		startRow = 1;
		startCol = 4;
		break;
		
	case (int)'I':
		temp[0][1] = '*';
		temp[1][1] = '*';
		temp[2][1] = '*';
		row = 3;
		col = 1;
		startRow = 1;
		startCol = 5;
		break;
		
	case (int)'S' + (int)'Q':
		temp[0][0] = '*';
		temp[0][1] = '*';
		temp[1][0] = '*';
		temp[1][1] = '*';
		row = 2;
		col = 2;
		startRow = 1;
		startCol = 4;
		break;
		
	case (int)'M' + (int)'L':
		temp[0][1] = '*';
		temp[1][1] = '*';
		temp[2][1] = '*';
		temp[2][0] = '*';
		row = 3;
		col = 2;
		startRow = 1;
		startCol = 4;
		break;
		
	}
	
	for(int i = 1, m = 0; i < 4; i++,m++) {
		for(int j = 4, n = 0; j < 7; j++,n++) {
			if(temp[m][n] == ' ')
				continue;
			
			if(p1.board[i][j] == '*')
				return false;
			
			p1.board[i][j] = temp[m][n];
		}
	}
	
	return true;
	
}


}
