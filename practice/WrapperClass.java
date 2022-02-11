package com.copy;
/*
 * practice about wrapper class
 */
import java.util.*;

public class WrapperClass {
	
public static void  main(String[] args) {	
	
Scanner scan = new Scanner(System.in);

Integer i1 = Integer.valueOf(2);

Integer i2 = i1.valueOf(3);

int x = i1.intValue();

System.out.println(x);

System.out.println(i1);

System.out.println(i2);

String s = "112";
Integer i3 = Integer.parseInt(s);
System.out.println(i3);				
}
}
