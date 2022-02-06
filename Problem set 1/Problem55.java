package com.practice;

import java.util.Scanner;

public class Problem55 {
private static long  pow(long base , int exponent) {//function to return power value.
		
		long result = 1;
		while(exponent > 0) {
			result *= base;
			--exponent;
		}
		
		return result;
		
	}
	
	private static boolean isArmstrong( long n) { //function to check Armstrong or not
		
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
		sum += pow( temp % 10 , size );//calling pow function
		temp /= 10;
		}
	return sum == n ? true : false;
	}
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
		
		System.out.println(" enter the number: ");
		
		int n = scan.nextInt();
		
		boolean prime = isPrime(n);
		boolean armstrong = isArmstrong(n);
		if(prime == true && armstrong == false)
			System.out.println(n + " is only a prime number");
		if(prime == false && armstrong == true)
			System.out.println(n + " is only a armstrong number");
		if(prime == true && armstrong == true)
			System.out.println(n + " is both prime and armstrong number");
		if(prime == false && armstrong == false)
			System.out.println(n + " is not a prime and not a armstrong number");
		}
	
}
