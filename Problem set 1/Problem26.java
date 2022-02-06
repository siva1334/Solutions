package com.practice;

import java.util.Scanner;

public class Problem26 {

	public static void  main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the no of Km ");	
		
		System.out.println( "Miles = "+ scan.nextInt() * 0.6214);
		
		System.out.println(" enter the celcius value ");
		
		
		System.out.println("F = " + (scan.nextInt()*1.8d+32));
		
		System.out.println("enter the sqr feet ");
	System.out.println("acre = "+ scan.nextInt()/43560.0);
		

		}
}
