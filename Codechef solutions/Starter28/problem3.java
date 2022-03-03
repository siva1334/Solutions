/*
Chef is planning to buy a new car for his birthday. After a long search, he is left with 2 choices:

Car 1: Runs on diesel with a fuel economy of x1 km/l
Car 2: Runs on petrol with a fuel economy of x2 km/l
Chef also knows that

the current price of diesel is y1 rupees per litre
the current price of petrol is y2 rupees per litre
Assuming that both cars cost the same and that the price of fuel remains constant, which car will minimize Chef's expenses?

Print your answer as a single integer in the following format

If it is better to choose Car 1, print −1
If both the cars will result in the same expenses, print 0
If it is better to choose Car 2, print 1
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
    int x1 = scan.nextInt(); 
    int x2 = scan.nextInt(); 
    int y1 = scan.nextInt(); 
    int y2 = scan.nextInt();
    
    double xx =(double) y1 / x1;
    double yy = (double)y2 / x2;
    
    int ans = 0;
    if(xx > yy){
        ans = 1;
    }
    else if(yy > xx){
        ans = -1;
    }
   
    
    System.out.println(ans);
    
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
