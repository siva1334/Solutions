package com.practice;

import java.util.Scanner;

public class Problem51 {
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
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the intervels: ");
		
		long start = scan.nextLong();
		long end = scan.nextLong();
		
		for( long i = start; i <= end; i++) {
			
			if(isArmstrong(i)) // calling isArmstrong function.
				System.out.print(i + " ");
		}


		}

}
