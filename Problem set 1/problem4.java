package com.practice;

import java.util.Scanner;

public class problem4 {
	
	public static void main ( String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
			
if( scan.nextFloat() == scan.nextDouble() )
				
				System.out.println("it is same");
			
			else System.out.println("it is not same");
		
		}
/*
 *  they are same if only they are integers.
 *  
 *  float converted to double while comparing but the extra bits are zero but 
 *  double has ones also. so the bit comparision return false if they have floating point
 *
 */
	
 

}
