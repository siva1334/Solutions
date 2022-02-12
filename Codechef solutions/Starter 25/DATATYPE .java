/*
Chef wants to store some important numerical data on his personal computer.
He is using a new data type that can store values only from 0 till N both inclusive.
If this data type receives a value greater than N then it is cyclically converted to fit into the range 0 to N. For example:

Value N+1 will be stored as 0.
Value N+2 will be stored as 1.
and so on…

Given X, the value chef wants to store in this new data type. Determine what will be the actual value in memory after storing X
*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int res =x;
		   
		    if(x>n){
		    
		    res = (x%(n+1));
		    
		    }
		    System.out.println(res);
		}
	}
}
