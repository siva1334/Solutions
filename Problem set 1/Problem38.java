package com.practice;

import java.util.Scanner;

public class Problem38 {
	
	
		public static void  main(String[] args) {	
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the no:");
		
		int n = scan.nextInt();
		
		int sum = 0;
		for ( int i = 0; i <= n; i++)
			sum += i;
		
		System.out.println("sum = " + sum);

		}

}
