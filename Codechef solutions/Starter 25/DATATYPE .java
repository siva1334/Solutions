/*
Chef has closed his restaurant and decided to run a fruit stand instead.
His signature dish is a fruit chaat consisting of 2 bananas and 1 apple.
He currently has X bananas and Y apples. How many chaats can he make with the fruits he currently has?
*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int res =x;
		   
		    if(x>n){
		    
		    res = (x%(n+1));
		    
		    }
		    System.out.println(res);
		}
	}
}
