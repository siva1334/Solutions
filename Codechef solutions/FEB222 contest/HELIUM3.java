/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static Scanner scan = new Scanner(System.in) ;
   static void solve(){
      
       int a = scan.nextInt();
        int b = scan.nextInt();
         int x = scan.nextInt();
          int y = scan.nextInt();
          if(a*b > x*y)
          System.out.println("NO");
          else System.out.println("YES");
   }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = scan.nextInt();
		while( t-- > 0){
		    solve();
		}
	}
}
