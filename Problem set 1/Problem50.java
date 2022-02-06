package com.practice;

import java.util.Scanner;

public class Problem50 {
	
	private static long  pow(long base , int exponent) {
		
		long result = 1;
		while(exponent > 0) {
			result *= base;
			--exponent;
		}
		
		return result;
		
	}
		
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the number: ");
		long n = scan.nextLong();
		
		 int size = 0;
		 long temp = n;
		while (temp > 0)
		{
			++size;
			temp /= 10;
		}
		
		temp = n;
		long sum = 0;
		
		while(temp > 0) {
		sum += pow( temp % 10 , size );
		temp /= 10;
		}
		
		if( sum == n)
			System.out.println(n + " is a Armstrong Number ");
		else System.out.println(n + " is not a Armstrong Number ");


		}

}
