package com.practice;

import java.util.Scanner;

public class Problem35 {

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter a,b,c ");
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		
		double root = b * b - (4 * a * c);
		
		
		if(root < 0.0) {
			root*=-1;
		double sqt = Math.sqrt(root);
		sqt /= (2 * a);
		b *= -1.0;
		b /= (2.0 * a);
		System.out.println("r1 = " + b +'+' + sqt + 'i');
		System.out.println("r1 = " + b +'-' + sqt + 'i');
			
		}
		else {
			b *= -1.0;
			double sqt = Math.sqrt(root);			
			System.out.println("r1 = " + ( (b + sqt)/ (2.0*a) )  );
			System.out.println("r2 = " + ( (b - sqt)/ (2.0*a) )  );
		}

		}
}
