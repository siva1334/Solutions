/*
Valentine's Day is approaching and thus Chef wants to buy some chocolates for someone special.

Chef has a total of X rupees and one chocolate costs Y rupees. What is the maximum number of chocolates Chef can buy?
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static void solve(){
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(x/y);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		    solve();
		}
	}
}
