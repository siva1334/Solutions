package com.practice;

import java.util.Scanner;

public class Problem62 {
	
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
	
	private static int binary_to_decimal(String s) {
		
		int len = s.length();		
		int decimal = 0;
		int j = 0;
		for(int i = len-1; i>=0; --i) {
			if(s.charAt(i) == '1')
				decimal += pow(2,j);
			++j;
		}
		return decimal;
	}
	private static String decimal_binary(int n) {
		
		String binary = "";
		
		while(n>1) {
			if(n%2==1)
			binary +="1";
			else binary +="0";
			n /= 2;
			
		}
		if(n == 0)
			binary += "0";
		else
		binary +="1"; // need to reverse this string.
		
		int end = binary.length()-1;
		String reverse = "";
		while(end>=0) {
			reverse += binary.charAt(end--);
		}
		return reverse;
		
	}
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the binary value: ");
		String s = scan.next();
		
		int decimal = binary_to_decimal(s);
		System.out.println("octal value = " + decimal_to_octal(decimal));
		
		
		System.out.println("enter the octal value: ");
		int octal = scan .nextInt();
		decimal = octal_to_decimal(octal);
		
		System.out.println("binary value = " + decimal_binary(decimal));
		
		
		
	
		}

	
}
