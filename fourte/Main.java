package com.fourte;

//1,2,3,4   value = 10
//1,4,5,9 value = 100
//4 2 5 9 value = 8
//7 9 3 6 value = 19
//3 1 8 4 value = 12
//5 4 9 9 value = 101
//6 4 3 2 value = 42

import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		int a[] = new int[4];

		System.out.println("enter the four values: ");

		for (int i = 0; i < 4; i++) {
			a[i] = scan.nextInt();
		}

		Game obj = new Game();
		System.out.println("enter the target value: ");
			obj.target= scan.nextInt();

		int temp[] = new int[4];

		
		for (int i = 0; i < 4; i++) {
			temp[0] = a[i];
			obj.step2(a, temp, i);

		}
	
		scan.close();
	}


}
