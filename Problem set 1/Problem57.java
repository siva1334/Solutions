package com.practice;

import java.util.Scanner;

public class Problem57 {
	
	private static int sum(int n) {
		if(n==0)
			return 0;
		
		return n + sum(n-1);
	}
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int n = scan.nextInt();
		
		System.out.println("sum = " + sum(n));

		}

}
