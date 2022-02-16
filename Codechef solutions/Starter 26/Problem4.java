/*
There are initially X people in a room.

You are given an array A of length N which describes the following events:

If Ai≥0, then Ai people enter the room at i-th minute. For e.g. if A2=3, then 3 people enter the room at the 2-nd minute.
If Ai<0, then |Ai| people leave the room at i-th minute. Here |Ai| denotes the absolute value of Ai. For e.g. if A4=−2, then 2 people leave the room at the 4-th minute.
Determine the maximum number of people in the room at any moment of time.

It is guaranteed in the input that at any moment of time, the number of people in the room does not become negative.
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
        int x = scan.nextInt();
        int ans = x;
        while(n-- > 0){
            int temp = scan.nextInt();
            x+=temp;
            if(x > ans)
            ans = x;
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
