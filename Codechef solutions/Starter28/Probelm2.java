/*
A particular month has 30 days, numbered from 1 to 30.

Day 1 is a Monday, and the usual 7-day week is followed (so day 2 is Tuesday, day 3 is Wednesday, and so on).

Every Saturday and Sunday is a holiday. There are N festival days, which are also holidays. Note that it is possible for a festival day to occur on a Saturday or Sunday.

You are given the dates of the festivals. Determine the total number of holidays in this month.
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
        int n = scan.nextInt();
        int ans = 8 + n;
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            if(x % 7 == 0)ans--;
            else{
                if(x==6)ans--;
                else if(x == 13)ans--;
                else if(x== 20)ans--;
                else if(x== 27)ans--;
              
            }
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
