/*
A secret team of programmers is plotting to disrupt the programming language landscape and bring punched cards back 
by introducing a new language called Punched Card Python that lets people code in Python using
punched cards! Like good disrupters, they are going to launch a viral campaign to promote their
new language before even having the design for a prototype. For the campaign, they want to draw punched cards of different sizes in ASCII art.

Example Punched Card.

The ASCII art of a punched card they want to draw is similar to an R×C matrix without the top-left cell.
That means, it has (R⋅C)−1 cells in total. Each cell is drawn in ASCII art as a period (.) surrounded 
by dashes (-) above and below, pipes (|) to the left and right, and plus signs (+) for each corner
. Adjacent cells share the common characters in the border. Periods (.) are used to align the cells in the top row.

For example, the following is a punched card with R=3 rows and C=4 columns:

..+-+-+-+
..|.|.|.|
+-+-+-+-+
|.|.|.|.|
+-+-+-+-+
|.|.|.|.|
+-+-+-+-+
There are more examples with other sizes in the samples below. Given the integers R and C describing the size of a punched card,
print the ASCII art drawing of it as described above.
*/

//package com.codejame;
import java.util.*;


public class Solution {
	
	static Scanner scan = new Scanner(System.in);
	
	static void solve() {
		int row = scan.nextInt();
		int col = scan.nextInt();
		
		
		String s1 = "..";
		String s2 = "..";
		for(int i = 0; i < col - 1; i++) {
			s1 += "+-";
		}
		s1 += "+";
		
		for(int i = 0; i < col - 1; i++) {
			s2 += "|.";
		}
		s2 += "|";
		
		System.out.println(s1);
		System.out.println(s2);
		row--;
		
	String line1 = "";
	
	for(int i = 0; i < col; i++) {
		line1 += "+-";
	}
	line1 += "+";
	
	String line2 = "";
	
	for(int i = 0; i < col; i++) {
		line2 += "|.";
	}
	line2 += "|";
	
	for(int i = 0; i < row; i++) {
		System.out.println(line1);
		System.out.println(line2);
	}
	
	System.out.println(line1);
		
		
	}
	
	public static void main(String[] args) {
		
		int i = 1;
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			System.out.println("case #" + i++ + ":");
			solve();
		}

	}

}

