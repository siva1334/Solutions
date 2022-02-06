package com.practice;

import java.util.Scanner;

public class Problem54 {
	
	private static boolean isPrime( int n)

	{
		if(n == 1)
			return false;
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0)
			return false;		
		}
		
		return true;
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the intervals: ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		for( int i = start; i <= end; ++i)
			if( isPrime(i))
				System.out.print(i + " ");
		


		}

}
