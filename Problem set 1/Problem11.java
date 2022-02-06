package com.practice;
import java.text.*;

import java.util.Scanner;

public class Problem11 {
	
public static void  main(String[] args) {	
	
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat dec= new DecimalFormat("#0.00");
		
		System.out.println(dec.format(7.50));//used decimal format class to set format.
		
		System.out.printf("%.2f",7.50);
	}

}
