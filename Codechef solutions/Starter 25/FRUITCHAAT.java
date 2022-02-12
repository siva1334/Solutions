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
    static int min(int x,int y){
        if(x>y)
        return y;
        else return x;
    }
    static int solve(int x, int y){
       
        x/=2;
        return min(x,y);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
		int t = sc.nextInt();
		while( t-- > 0 ){
		  int x = sc.nextInt();
		  int y = sc.nextInt();
		    System.out.println(solve(x,y));
		}
	}
}
