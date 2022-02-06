package com.practice;

import java.util.Scanner;

public class Problem14 {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the radius ");
		
		int r = scan.nextInt();
		
		System.out.println("enter the height ");
		
		int h = scan.nextInt();
		
System.out.println("Area is "+ ((2 * Math.PI * r * h) + (2 * Math.PI * r * r)));
		
}


}
