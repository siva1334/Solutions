/*
The mayor of your city has decided to throw a party to gather the favour of his people in different regions of the city.

There are 3 distinct regions in the city namely A, B, C comprising of PA, PB and PC number of people respectively.

However, the mayor knows that people of the region B are in conflict with people of regions A and C. 
So, there will be a conflict if people from region B are present at the party along with people from region A or C.

The mayor wants to invite as many people as possible and also avoid any conflicts. Help him invite maximum number of people to the party.
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
        int a= scan.nextInt();
         int b= scan.nextInt();
          int c= scan.nextInt();
          if(a+c > b)
          System.out.println(a+c);
          else System.out.println(b);
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
