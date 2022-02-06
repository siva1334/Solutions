package com.practice;

import java.util.Scanner;

public class Problem31 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the values ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
	// method 1, using temporary variable.	
		int temp = x;
		x = y;
		y = temp;		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
	// method 2, without temporary variable.
		
		System.out.println(" enter the values ");
		 x = scan.nextInt();
		 y = scan.nextInt();		 
		x = x + y;
		y = x - y;
		x = x - y;		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	// method 3, using XOR operator property.
		
		System.out.println(" enter the values ");
		x = scan.nextInt();
		y = scan.nextInt();
		x = x ^ y;
		y = y ^ x;
		x = y ^ x;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		 
		
		}

}
