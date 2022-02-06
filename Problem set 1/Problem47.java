package com.practice;

import java.util.Scanner;

public class Problem47 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
       
		System.out.println(" enter the base: ");
		int base = scan.nextInt();
		
		System.out.println(" enter the exponent: ");
		int exponent = scan.nextInt();
		
	     long result = 1;
		while(exponent > 0) {
			result *= base;
			--exponent;
		}
		
		System.out.println(" power = " + result);

		}

}
