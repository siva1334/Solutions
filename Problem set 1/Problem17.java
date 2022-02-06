package com.practice;

import java.util.Scanner;

public class Problem17 {
	
	public static void  main(String[] args) {	
		
	
		Scanner scanner = new Scanner(System.in);
		
		int x = -10; 
		System.out.println(x++);//post increment operator
		
		System.out.println(x);
		
		System.out.println(++x);//pre-increment operator
		
		x=~x;// unary bitwise operator
		System.out.println(x);
	}
}
