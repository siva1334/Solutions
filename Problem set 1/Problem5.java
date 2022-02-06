package com.practice;
import java.util.*;

public class Problem5 {
	
public static void main ( String args[]) {
		
		Scanner scan = new Scanner (System.in);
		
		short shortNumber = scan.nextShort();
	
		
		byte byteNumber = (byte)shortNumber; //it stores only last 8 bits of short.
		
		System.out.println(byteNumber);
		
}

}
