package com.practice;

import java.util.Scanner;

public class Problem49 {
	
	private static boolean isPrime( int n)
	{
		
		for(int i = 2; i <= n/2; i++) {
			if(n%i == 0)
			return false;		
		}
		
		return true;
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int n = scan.nextInt();
		
		if(isPrime(n))
			System.out.println(  n + " is a prime number");
		
		else System.out.println(  n + " is not a prime number");


		}

}
