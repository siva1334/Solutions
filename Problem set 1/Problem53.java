package com.practice;

import java.util.Scanner;

public class Problem53 {

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your expresion with space: ");
		int a = scan.nextInt();
		char c = scan.next().charAt(0);
		int b= scan.nextInt();
		
		switch(c) {
		
		case '+':
			System.out.println("a + b = " + (a+b));
			break;
		
		case '-':
			System.out.println("a - b = " + ( a-b));
			break;
			
		case '*':
			System.out.println("a * b = " + ( a*b));
			break;
		
		case '/':
			System.out.println("a / b = " + ( a/b));
			break;
		
		case '%':
			System.out.println("a % b = " + ( a%b));
			break;
			
		default:
			System.out.println("Invaid Opreator");
			
		}
		


		}
}
