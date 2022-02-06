package com.practice;

import java.util.Scanner;

public class Problem60 {
	private static int pow(int base, int exponent) {
		int result = 1;
		while(exponent > 0) {
			result *= base;
			--exponent;
		}
		return result;
	}

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		//calculating binary to decimal
		System.out.println("enter the binary value");
		String s = scan.next();
		int len = s.length();
		
		int decimal = 0;
		int j = 0;
		for(int i = len-1; i>=0; --i) {
			if(s.charAt(i) == '1')
				decimal += pow(2,j);
			++j;
		}		
		System.out.println("decimal value = " + decimal);
		
	//calculating decimal to binary		
	System.out.println("enter the number: ");
	int n = scan.nextInt();
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
	
	
	System.out.println("binary value = " + reverse);
	

		}
}
