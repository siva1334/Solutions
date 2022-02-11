package com.copy;
/*
 * practice about order of exicutions of static blocks, instance blocks,
 */
import java.util.Scanner;
 class Ss{
	 Ss(){
		 System.out.println("constructor");
	 }
	static {
		System.out.println("static 2");
	}
	{
		System.out.println("instance");
	}
}

public class Static {
	
	public static void  main(String[] args) {	
		Scanner scan = new Scanner (System.in);
		String s1;
		String s2;
		Static obj1 = new Static();
		Static obj2 = new Static();
		System.out.println(obj1);
		System.out.println(obj2);
		s1 = scan.next();
		s2 = scan.next();
		System.out.println(s1==s2);
		
		
}
}
