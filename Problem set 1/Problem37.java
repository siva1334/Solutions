package com.practice;

import java.util.Scanner;

public class Problem37 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the char");
		
		char c = scan.next().charAt(0);
		
	if( (c >= 65 && c <= 90) || (c >=97 && c <= 122))//ASCCI range 65 to 90 and 97 to 122.
			System.out.println(c + " is Alphabet");
		
		else System.out.println(c + " is not Alphabet");

		}

}
