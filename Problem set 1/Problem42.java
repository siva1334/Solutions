package com.practice;

import java.util.Scanner;

public class Problem42 {
	
	private static int min( int x, int y) {
	return x>y?y:x;
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the two values ");
		int x = scan .nextInt();
		int y = scan .nextInt();
		
		int GCD = 0;
		
		for( int i = 1; i <= min(x,y); i++)
			
			if(x%i == 0 && y%i == 0 )	
				
				if(GCD < i)
				 GCD = i;
		
		System.out.println("GCD = " + GCD);



		}

}
