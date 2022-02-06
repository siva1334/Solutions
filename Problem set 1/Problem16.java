package com.practice;

import java.util.Scanner;

public class Problem16 {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the radius of outter circle ");
		
		double r1 = (double) scan.nextInt();
		
		System.out.println("enter the radius of inner circle ");
		
		double r2 = (double) scan.nextInt();
		
		System.out.println( "Area is " + ((Math.PI*r1*r1) - (Math.PI*r2*r2) ));
		
		
}

}
