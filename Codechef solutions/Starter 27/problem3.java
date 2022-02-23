/*
Given two positive numbers B and C, what is the minimum positive value of A, such that A⋅B is divisible by C.

Here, A⋅B denotes the value obtained when A is multiplied by B.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    static long gcd(int b, int c){
        if (c == 0){
           return b; 
        }
        return gcd(c, b%c);
    }
    static long solve(){
        int b = scan.nextInt();
        int c= scan.nextInt();
        long ans= (b / gcd(b ,c)) * c;   
        ans /= b;
        return ans;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		   System.out.println(solve()); 
		}
	}
}
