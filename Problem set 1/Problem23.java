package com.practice;

import java.util.Scanner;

public class Problem23 {
	
	public static void  main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 10;
		
		x = x++ * 2 + 3* -x;// equal to (10*2)+(3*(-11)).it is 20-33= -13.
		
		System.out.println(x);

		}

}
