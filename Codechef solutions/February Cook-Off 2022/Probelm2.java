/*
Ved is a salesman.
He needs to earn at least W rupees in N days for his livelihood.
However, on a given day i (1≤i≤N), he can only earn Ai rupees by working on that day.

Ved, being a lazy salesman, wants to take as many holidays as possible. 
It is known that on a holiday, Ved does not work and thus does not earn anything.
Help maximize the number of days on which Ved can take a holiday.

It is guaranteed that Ved can always earn at least W rupees by working on all days.
*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static int solve(){
        int n = scan.nextInt();
        int w = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        a[i] = scan.nextInt();
        
        Arrays.sort(a);
        
        int max = 0;
        int count = 0;
        for(int i = n-1; i >= 0 ;i--){
            if(max >= w){
               return n-count;
            }
            else{
                max += a[i];
                count++;
            }
        }
        return 0;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		   System.out.println(solve()); 
		}
	}
}
