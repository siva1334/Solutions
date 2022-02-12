/*
Chef is given a contract to build towers in Chefland which are made by stacking blocks one above the other. 
Initially, there is only 1 block in the inventory and no tower has been built. Chef follows the following 2 steps in each operation:

Either build a new tower or update an existing tower that has been built in previous operations using any number of blocks currently present in the inventory. After this step, the size of the inventory reduces by the number of blocks used.
Suppose the tower Chef updated or built has B blocks after the step, Chef gets to add B new blocks to the inventory as a reward.
Find the maximum number of towers of height X that Chef can build in M operations.

Note: Tower of height X means that the tower consists of X blocks placed one above the other.
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
