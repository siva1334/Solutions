/* package codechef; // don't place package name! */
/*
You know that 1 kg of pulp can be used to make 1000 pages and 1 notebook consists of 100 pages.

Suppose a notebook factory receives N kg of pulp, how many notebooks can be made from that?
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static void solve(){
        int x= scan.nextInt();
        System.out.println(x*10);

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
