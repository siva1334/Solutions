/* package codechef; // don't place package name! */
/*
Chef wants to reach home as soon as possible. He has two options:

Travel with his BIKE which takes X minutes.
Travel with his CAR which takes Y minutes.
Which of the two options is faster or do they both take same time?
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
        int y = scan.nextInt();
        if(x < y){
            System.out.println("BIKE");
        }
        else if(y < x){
             System.out.println("CAR");
        }
        else  System.out.println("SAME");
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
