package com.practice;

import java.util.Scanner;

public class Problem43 {
	
		
		private static int max( int x, int y) {
		return x>y?x:y;
		}
		
		public static void  main(String[] args) {	
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println(" enter only natural numbers: ");
			int x = scan .nextInt();
			int y = scan .nextInt();
			
			if(x == 0 || y == 0)
				System.out.println(" 0 is not a valid input");
			else {
			for( int i = max(x , y); true ; i++) {
				
				if(i%x == 0 && i%y == 0 )	{
				System.out.println("LCM = " + i);
				break;
				}
			}
			}
					
					
			



			}


}
