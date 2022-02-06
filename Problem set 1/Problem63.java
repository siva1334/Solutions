package com.practice;

import java.util.Scanner;

public class Problem63 {
	
	private static String rever(String s, int len) {
		if(len<0)
			return "";
		return s.charAt(len) + rever(s,len-1);		
	}
	
	private static String reverse(String s, int i) {
		if(i<0)
			return "";
		
		String ans ="";
		for(;i>=0 && s.charAt(i) != ' ' ; --i) {
		ans += s.charAt(i);	
		}
		int len = ans.length()-1;
		return rever(ans,len) + " " + reverse(s,i-1);
		
	}

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the sentense: ");
		
		String s = scan.nextLine();		
		
		int len = s.length()-1;
		
		System.out.println(reverse(s,len));
		



		}
}
