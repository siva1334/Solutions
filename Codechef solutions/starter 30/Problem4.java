/*
Chef wants to impress Chefina by giving her the maximum number of gifts possible.

Chef is in a gift shop having N items where the cost of the ith item is equal to Ai. 
Chef has K amount of money and a 50% off discount coupon that he can use for at most one of the items he buys.

If the cost of an item is equal to X, then, after applying the coupon on that item, Chef only has to pay ⌈X2⌉ (rounded up to the nearest integer) amount for that item.

Help Chef find the maximum number of items he can buy with K amount of money and a 50% discount coupon given that he can use the coupon on at most one item.
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
        int k = scan.nextInt();
        
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        Arrays.sort(a);
        
        int cnt = 0;
        
        for(int i = 0; i < n ; i++){
          if(a[i] <= k){
              cnt++;
              k -= a[i];
          }
          else{
              if(Math.ceil(a[i]/2.0) <= k){
                  cnt++;
                  break;
              }
          }
        }
        
        System.out.println(cnt);

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
