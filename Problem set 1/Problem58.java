package com.practice;

import java.util.Scanner;

public class Problem58 {
	
	private static long fact(long n) {
		if(n<=1)
			return n;
		
		return n * fact(n-1);
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		long n = scan.nextInt();
		
		System.out.println("factorial = " + fact(n));


		}

}
