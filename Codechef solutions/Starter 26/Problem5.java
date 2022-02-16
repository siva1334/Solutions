/*
There are two types of vehicles in Chefland.

Bus which has a capacity of 100 people.
Car which has a capacity of 4 people.
There are N people who want to travel from place A to place B. You know that a single bus emits X units of smoke while a single car emits Y units of smoke in their journey from A to B.

You want to arrange some buses and cars to carry all these N people such that total smoke emitted is minimized. Output the minimized smoke value.
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
        int x= scan.nextInt();
        int y = scan.nextInt();
        int ans = 1000000000;
        
        int bus = n / 100;
        int car = n / 4;
        int rem = 0;
        if(n % 100 != 0)
        rem = 1;
        
        int temp = (bus * x);
        if(rem > 0)
        temp += x;
        
        if(temp < ans)
        ans = temp;
        
        rem = 0;
        if(n % 4 != 0)
        rem = 1;
        temp = car * y;
        if(rem > 0)
        temp += y;
        
        if(temp < ans)
        ans = temp;
        
        temp = bus * x;
        n = n%100;
        car = n/4;
        rem = 0;
        if(n%4 !=0)
        rem = 1;
        
        temp = temp + (car * y);
        if(rem > 0)
        temp += y;
        if(temp < ans)
        ans = temp;
        
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
