package com.practice;

import java.util.Scanner;

public class Problem56 {
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
		
		int i = 2;
		int j = n-2;
		boolean ans = false;
		
		while( i <= j) {
			if(isPrime(i) && isPrime(j)) {
				ans = true;
				break;
			}
			++i;
			--j;
		}
		
	if(ans)
	System.out.println(n + " can be expressed as a sum of two prime numbers");
		
	else System.out.println(n + " can not be expressed as a sum of two prime numbers");


		}

}
