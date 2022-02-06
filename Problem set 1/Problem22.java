package com.practice;

import java.util.Scanner;

public class Problem22 {

	public static void  main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 28;
		
		a+=a++ + ++a + --a+a--;
	//equal to a=28+(28+30+29+29).
		
		
		
		System.out.println(a); // prints 144.
		
		System.out.println(28+(28+30+29+29));//prints 144.

		}
}
