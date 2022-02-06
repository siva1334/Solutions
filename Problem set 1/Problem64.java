package com.practice;

import java.util.Scanner;

public class Problem64 {
	
	private static int pow(int base, int exponent) {
		if(exponent <= 0)
			return 1;
		
		return base * pow(base , exponent-1);
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the base: ");
		int base = scan.nextInt();
		
		System.out.println("enter the exponent: ");
		int exponent = scan.nextInt();
		
		System.out.println("Power = " + pow(base , exponent));

		}

}
