/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
   
    static void solve(){
        int n = scan.nextInt();
        String s = scan.next();
        int zero = 0;
        int one = 0;
        for(int i  = 0; i < n; i++){
            if(s.charAt(i) == '0')
            zero++;
            else one++;
        }
        if(Math.abs(one - zero) <= 1)
         System.out.println("YES");
         
         else if(zero%2 == 0 || one%2 == 0)
          System.out.println("YES");
          else  System.out.println("NO");
        
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
