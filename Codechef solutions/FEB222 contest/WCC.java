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
        String s = scan.next();
        int c= 0;
        int n = 0;
        
        for(int i = 0; i < s.length();++i){
            if(s.charAt(i) == 'C')
            c++;
            else if(s.charAt(i) == 'N')
            n++;
        }
        if(c > n)
    System.out.println(60 * x);
    else if(c == n)
   System.out.println(55 * x);
   else  System.out.println(40 * x);
        
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
