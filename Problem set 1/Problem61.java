package com.practice;

import java.util.Scanner;

public class Problem61 {
	
	private static int pow(int base, int exponent) {
		int result = 1;
		while(exponent > 0) {
			result *= base;
			--exponent;
		}
		return result;
	}

	
	private static int octal_to_decimal(int octal) {
		int i = 0;
		int sum = 0;
		while(octal > 0) {
			sum += (octal%10) * pow(8,i);
			octal /= 10;
			i++;
		}
		return sum;
	}
	
	private static int decimal_to_octal(int binary) {
		int i = 0;
		int sum = 0;
		while(binary > 0) {
			sum += (binary%8) * pow(10,i);
			binary /= 8;
			i++;
		}
		return sum;
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the octal value: ");
		int octal = scan .nextInt();
		
		System.out.println("decimal value = " + octal_to_decimal(octal));
		
		System.out.println(" enter the decimal value: ");
		int binary = scan.nextInt();
		System.out.println("octal value = " + decimal_to_octal(binary));
		
	
		}

}
