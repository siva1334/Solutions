/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
  static void solve(){
        long x = scan.nextLong();
        long m = scan.nextLong() ;
        long towers = 0;
        long temp = 1;
        long operation = 1;
        while(temp < x ){
            temp *= 2;
            operation++;
        }
        if(operation <= m)
        towers = 1 +(m - operation);
        
        System.out.println(towers);
        
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
