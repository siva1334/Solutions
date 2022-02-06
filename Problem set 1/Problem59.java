package com.practice;

import java.util.Scanner;

public class Problem59 {
	
	
	
	private static int GCD(int x, int y, int i) {
		
		if(x%i == 0 && y % i == 0 )
			return i;
		 
		return GCD(x, y, i-1);
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the values: ");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int min = x>y?y:x;
		System.out.println("GCD = " + GCD(x,y,min));

		}

}
