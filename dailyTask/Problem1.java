/*
HuffmanDecoder
Here we will not make huffman code, but we'll be decoding one
The dictionary is already known and it consist of only five coded letters.
A → 0
B → 10
C → 110
D → 1110
E → 1111
You are given the encoded string, return the original one.
 Eg.
Input 1101110 Output:CD
Input 11111100 Output: ECA
*/

package com.day1;
import java.util.Scanner;
public class Problem1 {

	static char swi(String s) {
		switch(s) {
		
		case "0" ->{
			return 'A';
		}
		case "10" ->{
			return 'B';
		}
		
		case "110" ->{
			return 'C';
		}
		
		case "1110" ->{
			return 'D';
		}
		
		case "1111" ->{
			return 'E';
		}
		
		
		}
		
		return 'x';
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the string: ");
		
		String s = scan.next();
		
		int count = 0;
		String temp = "";
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '0' || count >= 3) {
				temp += s.charAt(i);
				ans += swi(temp);
				temp = "";
				count = 0;
			}
			
			else {
				count++;
				temp += s.charAt(i);
			}
		}
		
		System.out.println(ans);
		
	}

}
