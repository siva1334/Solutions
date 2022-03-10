
public class Rotations {
	
	

	boolean leftRotate(Player p1, Shape shape) {
		if(shape.row == 2 && shape.col == 2)return true;
		char temp[][];
		if(shape.row == shape.col) {
			 temp = new char[shape.row][shape.col];
			
			 
			 for(int i = 0; i < 3; i++) {
				 for(int j = 0; j < 3; j++) {
					 temp[j][i] = p1.board[shape.startRow + i][shape.startCol + 2 - j];
				 }
			 }
			 
			 
			 for(int i = 0; i < 3; i++) {
				 for(int j = 0; j < 3; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
				 }
			 }
		}
		
		else if(shape.row == 2 && shape.col == 3) {
			return twoCrossThreeLeft(p1,shape);
		}
		else if(shape.row == 3 && shape.col == 2) {
			return threeCrossTwoLeft(p1,shape);
		}
		else if(shape.row == 1 && shape.col == 3) {
			return oneCrossThree(p1,shape);
		}
		else {
			return threeCrossOne(p1,shape);
		}
		
		return true;
	}
	
	boolean rightRotate(Player p1, Shape shape) {
		if(shape.row == 2 && shape.col == 2)return true;
		char temp[][];
		if(shape.row == shape.col) {
			 temp = new char[shape.row][shape.col];
			
			 
			 for(int i = 2; i >= 0; i--) {
				 for(int j = 0; j < 3; j++) {
					 temp[j][i] = p1.board[shape.startRow + 2 - i][shape.startCol + j];
				 }
			 }
			 
			 for(int i = 0; i < 3; i++) {
				 for(int j = 0; j < 3; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
				 }
			 }
			 		 
		}
		
		else if(shape.row == 2 && shape.col == 3) {
			return twoCrossThreeRight(p1,shape);
		}
		
		else if(shape.row == 3 && shape.col == 2) {
			return threeCrossTwoRight(p1,shape);
		}
		
		else if(shape.row == 1 && shape.col == 3) {
			return oneCrossThree(p1,shape);
		}
		else {
			return threeCrossOne(p1,shape);
		}
		
		return true;
	}
	
	boolean moveLeft(Player p1, Shape shape) {
		
boolean flag = true;
		
		for(int i = 0; i < shape.row; i++) {
			if(p1.board[shape.startRow + i][shape.startCol - 1] == '*')
				flag = false;
			}
		
		if(flag == false) 
		{
			
			for(int i = 0; i < shape.row; i++) {
				if(p1.board[shape.startRow + i][shape.startCol - 1] == '*' && p1.board[shape.startRow + i][shape.startCol] == '*') {
					return true;
				}
			}
			
			for(int i = 0; i < shape.row; i++) {
				if(p1.board[shape.startRow + i][shape.startCol - 1] == '*') {
					continue;
				}
				p1.board[shape.startRow + i][shape.startCol - 1] = p1.board[shape.startRow + i][shape.startCol];
			}
			
			for(int i = 1; i < shape.col; i++) {
				for(int j = 0; j < shape.row; j++) {
	p1.board[shape.startRow + j][shape.startCol + i - 1] = p1.board[shape.startRow + j ][shape.startCol + i];		
			}
			}
			
			for(int i = 0; i < shape.row; i++) {
				p1.board[shape.startRow + i][shape.startCol + shape.col - 1] = ' ';
			}
			shape.startCol--;
			
			return false;
		}
		
		for(int i = 0; i < shape.col; i++) {
			for(int j = 0; j < shape.row; j++) {
p1.board[shape.startRow + j][shape.startCol + i - 1] = p1.board[shape.startRow + j][shape.startCol + i];
			}
		}
		
		for(int i = 0; i < shape.row; i++) {
			p1.board[shape.startRow + i][shape.startCol + shape.col - 1] = ' ';
		}
		
		shape.startCol--;
		return true;
	}
	
	boolean moveRight(Player p1, Shape shape) {
		boolean flag = true;
		
		for(int i = 0; i < shape.row; i++) {
			if(p1.board[shape.startRow + i][shape.startCol + shape.col] == '*')
				flag = false;
			}
		
		if(flag == false) {
			
			for(int i = 0; i < shape.row; i++) {
				if(p1.board[shape.startRow + i][shape.startCol + shape.col] == '*' && p1.board[shape.startRow + i][shape.startCol + shape.col - 1] == '*') {
					return true;
				}
			}
			
			for(int i = 0; i < shape.row; i++) {
				if(p1.board[shape.startRow + i][shape.startCol + shape.col] == '*') {
					continue;
				}
				p1.board[shape.startRow + i][shape.startCol + shape.col] = p1.board[shape.startRow + i][shape.startCol + shape.col - 1];
			}
			
			for(int i = shape.col - 2; i >= 0; i--) {
				for(int j = 0; j < shape.row; j++) {
	p1.board[shape.startRow + j][shape.startCol + i + 1] = p1.board[shape.startRow + j ][shape.startCol + i];		
			}
			}
			
			for(int i = 0; i < shape.row; i++) {
				p1.board[shape.startRow + i][shape.startCol] = ' ';
			}
			shape.startCol++;
			
			return false;
		}
		
		for(int i = shape.col - 1; i >= 0; i--) {
			for(int j = 0; j < shape.row; j++) {
p1.board[shape.startRow + j][shape.startCol + 1 + i] = p1.board[shape.startRow + j][shape.startCol + i];
			}
		}
		
		for(int i = 0; i < shape.row; i++) {
			p1.board[shape.startRow + i][shape.startCol] = ' ';
		}
		
		shape.startCol++;
		
		return true;
	}
	
	boolean moveDown(Player p1, Shape shape) {
		
		boolean flag = true;;
		
		for(int i = 0; i < shape.col; i++) {
		if(p1.board[shape.startRow + shape.row][shape.startCol + i] == '*')
			flag = false;
		}
		
		if(flag == false) {
			for(int i = 0; i < shape.col; i++) {
				if(p1.board[shape.startRow + shape.row][shape.startCol + i] == '*' && p1.board[shape.startRow + shape.row - 1][shape.startCol + i] == '*') {
					return false;
				}
			}
			for(int i = 0; i < shape.col; i++) {
				if(p1.board[shape.startRow + shape.row][shape.startCol + i] == '*') {
					continue;
				}
				p1.board[shape.startRow + shape.row][shape.startCol + i] = p1.board[shape.startRow + shape.row - 1][shape.startCol + i];
			}
			
			for(int i = shape.row - 2; i >= 0; i--) {
				for(int j = 0; j < shape.col; j++) {
	p1.board[shape.startRow + i + 1][shape.startCol + j] = p1.board[shape.startRow + i ][shape.startCol + j];		
			}
			}
			
			for(int i = 0; i < shape.col; i++) {
				p1.board[shape.startRow][shape.startCol + i] = ' ';
			}
			shape.startRow++;
			
			return false;
		}
		
		for(int i = shape.row - 1; i >= 0; i--) {
			for(int j = 0; j < shape.col; j++) {
p1.board[shape.startRow + i + 1][shape.startCol + j] = p1.board[shape.startRow + i ][shape.startCol + j];		
		}
		}
		
		for(int i = 0; i < shape.col; i++) {
			p1.board[shape.startRow][shape.startCol + i] = ' ';
		}
		shape.startRow++;
		return true;
	}
	
	boolean twoCrossThreeLeft(Player p1, Shape shape) {
		char temp[][] = new char[3][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				temp[j][i] = p1.board[shape.startRow + i][shape.startCol + 2 - j];
					
			}
		}
						
		int row = shape.startRow;
		int col = shape.startCol;
		
	if(p1.board[shape.startRow - 1][shape.startCol] != '*' && p1.board[shape.startRow - 1][shape.startCol + 1] != '*' ) {
		row--;	
	}
	else if(p1.board[shape.startRow - 1][shape.startCol + 1] != '*' && p1.board[shape.startRow - 1][shape.startCol + 2] != '*' ) {
		row--;
		col++;
	}
	else if(p1.board[shape.startRow + 2][shape.startCol] != '*' && p1.board[shape.startRow + 2][shape.startCol + 1] != '*' ) {
		
	}
	else if(p1.board[shape.startRow + 2][shape.startCol + 1] != '*' && p1.board[shape.startRow + 2][shape.startCol + 2] != '*' ) {
		col++;
	}
	else {
		return true;
	}
	
	for(int i = 0; i < 2; i++) {
		for(int j = 0; j < 3; j++) {
			p1.board[shape.startRow + i][shape.startCol + j] = ' ';
		}			
	}		
		shape.startRow = row;
		shape.startCol = col;
	
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
			}
		}
		
		shape.row = 3;
		shape.col = 2;
		
		return true;
	}
	
	boolean twoCrossThreeRight(Player p1, Shape shape) {
		char temp[][] = new char[3][2];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				temp[j][i] = p1.board[shape.startRow + 1 - i][shape.startCol + j];
					
			}
		}
		
		int row = shape.startRow;
		int col = shape.startCol;
		
	if(p1.board[shape.startRow - 1][shape.startCol] != '*' && p1.board[shape.startRow - 1][shape.startCol + 1] != '*' ) {
		row--;	
	}
	else if(p1.board[shape.startRow - 1][shape.startCol + 1] != '*' && p1.board[shape.startRow - 1][shape.startCol + 2] != '*' ) {
		row--;
		col++;
	}
	else if(p1.board[shape.startRow + 2][shape.startCol] != '*' && p1.board[shape.startRow + 2][shape.startCol + 1] != '*' ) {
		
	}
	else if(p1.board[shape.startRow + 2][shape.startCol + 1] != '*' && p1.board[shape.startRow + 2][shape.startCol + 2] != '*' ) {
		col++;
	}
	else {
		return true;
	}

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = ' ';
			}			
		}
		
		shape.startRow = row;
		shape.startCol = col;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
			}
		}
		
		shape.row = 3;
		shape.col = 2;
		
		return true;
	}
	
	boolean threeCrossTwoLeft(Player p1, Shape shape) {
		char temp[][] = new char[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				temp[i][j] = p1.board[shape.startRow + j][shape.startCol + 1 - i];
					
			}
		}
		
		int row = shape.startRow;
		int col = shape.startCol;
		
		 if(p1.board[shape.startRow + 1][shape.startCol - 1] != '*' && p1.board[shape.startRow + 2][shape.startCol - 1] != '*' ) {
			row++;
			col--;
		}
		else if(p1.board[shape.startRow + 1][shape.startCol + 2] != '*' && p1.board[shape.startRow + 2][shape.startCol + 2] != '*' ) {
			row++;
		}
		else if(p1.board[shape.startRow][shape.startCol - 1] != '*' && p1.board[shape.startRow + 1][shape.startCol - 1] != '*' ) {
			col--;	
		}
		else if(p1.board[shape.startRow][shape.startCol + 2] != '*' && p1.board[shape.startRow + 1][shape.startCol + 2] != '*' ) {
			
		}		
		else {
			return true;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = ' ';
			}			
		}
		
		shape.startRow = row;
		shape.startCol = col;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
			}
		}
		
		shape.row = 2;
		shape.col = 3;
		
		return true;
	}
	
	boolean threeCrossTwoRight(Player p1, Shape shape) {
		char temp[][] = new char[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				temp[i][j] = p1.board[shape.startRow + 2 - j][shape.startCol + i];
					
			}
		}
		
		int row = shape.startRow;
		int col = shape.startCol;
		
		 if(p1.board[shape.startRow + 1][shape.startCol - 1] != '*' && p1.board[shape.startRow + 2][shape.startCol - 1] != '*' ) {
				row++;
				col--;
			}
			else if(p1.board[shape.startRow + 1][shape.startCol + 2] != '*' && p1.board[shape.startRow + 2][shape.startCol + 2] != '*' ) {
				row++;
			}
			else if(p1.board[shape.startRow][shape.startCol - 1] != '*' && p1.board[shape.startRow + 1][shape.startCol - 1] != '*' ) {
				col--;	
			}
			else if(p1.board[shape.startRow][shape.startCol + 2] != '*' && p1.board[shape.startRow + 1][shape.startCol + 2] != '*' ) {
				
			}		
			else {
				return true;
			}

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = ' ';
			}			
		}
		
		shape.startRow = row;
		shape.startCol = col;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				p1.board[shape.startRow + i][shape.startCol + j] = temp[i][j];
			}
		}
		
		shape.row = 2;
		shape.col = 3;
		
		return true;
	}
	
	boolean oneCrossThree(Player p1, Shape shape){
	if(p1.board[shape.startRow - 1][shape.startCol + 1] == '*' || p1.board[shape.startRow + 1][shape.startCol + 1] == '*' ) {
			return false;
		}
	
	p1.board[shape.startRow - 1][shape.startCol + 1] = '*';
	p1.board[shape.startRow + 1][shape.startCol + 1] = '*';
	p1.board[shape.startRow ][shape.startCol ] = ' ';
	p1.board[shape.startRow ][shape.startCol + 2] = ' ';
	
	shape.startRow--;
	shape.startCol++;
	shape.row = 3;
	shape.col = 1;
		return true;
	}
	
	boolean threeCrossOne(Player p1, Shape shape) {
		if(p1.board[shape.startRow + 1][shape.startCol - 1] == '*' || p1.board[shape.startRow + 1][shape.startCol + 1] == '*' ) {
			return false;
		}
		
		p1.board[shape.startRow + 1][shape.startCol - 1] = '*';
		p1.board[shape.startRow + 1][shape.startCol + 1] = '*';
		p1.board[shape.startRow][shape.startCol] = ' ';
		p1.board[shape.startRow + 2][shape.startCol] = ' ';
		
		shape.startRow++;
		shape.startCol--;
		shape.row = 1;
		shape.col = 3;
		return true;
	}
	
	void remove(Player p1, Shape shape) {
		for(int i = 16; i > 0; i--) {
			boolean flag = true;
			for(int j = 1; j < 9; j++) {
				if(p1.board[i][j] != '*') {
					flag = false;
					break;
				}
			}			
				if(flag) {
					p1.score += 100;
					if(i == 1) {
						for(int k = 1; k < 9; k++) {
							p1.board[1][k] = ' ';
						}
					}else {
					for(int m = i; m > 1; m--) {
						for(int n = 1; n < 9; n++) {
							p1.board[m][n] = p1.board[m - 1][n];
						}
					}
					i++;
					}
				}
			
		}
	}
	
}
