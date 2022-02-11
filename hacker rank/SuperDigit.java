package com.hackerrank;
import java.util.*;
//861568688536788 100000




/*
 * We define super digit of an integer x using the following rules:

Given an integer, we need to find the super digit of the integer.

If  has only 1 digit, then its super digit is x.
Otherwise, the super digit of x is equal to the super digit of the sum of the digits of x.
For example, the super digit of 9875 will be calculated as:

	super_digit(9875)   	9+8+7+5 = 29 
	super_digit(29) 	2 + 9 = 11
	super_digit(11)		1 + 1 = 2
	super_digit(2)		= 2  
	
	Example
	n = '9875'
	k = 4
The number  is created by concatenating the string n k times so the initial p=9875987598759875.

    superDigit(p) = superDigit(9875987598759875)
                  9+8+7+5+9+8+7+5+9+8+7+5+9+8+7+5 = 116
    superDigit(p) = superDigit(116)
                  1+1+6 = 8
    superDigit(p) = superDigit(8)
All of the digits of p sum to 116. The digits of 116 sum to 8. 8 is only one digit, so it is the super digit.


 */

class Solution {
	public static int returnInt(char c) {// method to return the respective integer value.
		int returnValue = 0;
		
		switch(c) {
		case '0': returnValue = 0;break;
		case '1': returnValue = 1;break;
		case '2': returnValue = 2;break;
		case '3': returnValue = 3;break;
		case '4': returnValue = 4;break;
		case '5': returnValue = 5;break;
		case '6': returnValue = 6;break;
		case '7': returnValue = 7;break;
		case '8': returnValue = 8;break;
		case '9': returnValue = 9;break;
		}
		
		return returnValue;
	}
	
	public int superDigit(String digits) {//recursive method to calculate super digit
		
		if(digits.length() == 1) //base case, if length is 1 then return the integer.
			return returnInt(digits.charAt(0));
		
		int addValue = 0;
		for(int i = 0; i < digits.length(); ++i)// loop to calculate sum of the given string
			addValue += returnInt(digits.charAt(i));
		
		 return superDigit("" + addValue);//calling recursive function with new string			
	}
}

public class SuperDigit {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values: ");
		
	String digit = scan.next(); //scan the digit as a string
	int n = scan.nextInt(); //scan the input k.
	
	long addValue = 0;
	
	for(int i = 0; i < digit.length(); i++) {//adding all elements in the digit
		addValue +=Solution.returnInt(digit.charAt(i));
	}
	addValue *= n;//multiply the addvalue with n.
		
		Solution obj = new Solution(); //creating object to solution class
		
		System.out.println(obj.superDigit("" + addValue));//calling superDigit method.
		
	}

}
