package com.practice;

import java.util.Scanner;

public class Problem33 {

	public static boolean swi( char c) {
		boolean b = false;
		switch(c) {
		case 'a':b=true;break;
		case 'A':b=true;break;
		case 'e':b=true;break;
		case 'E':b=true;break;
		case 'i':b=true;break;
		case 'I':b=true;break;
		case 'o':b=true;break;
		case 'O':b=true;break;
		case 'u':b=true;break;
		case 'U':b=true;break;
		}
		return b;
	}
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		char c = scan.next().charAt(0);
		if( swi(c) )
			
		System.out.println(c + " is vowel");
		
		else System.out.println(c + " is consonant");
		
	}
}
