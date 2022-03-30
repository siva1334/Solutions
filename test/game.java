package com.practice;
// 1,2,3,4   value = 10
//1,4,5,9 value = 100
import java.util.Scanner;

public class Game {

	static int target;
	static String ans = "";

//	int swi(char c , int a, int b) {
//		int val = 0;
//		
//		switch(c) {
//		case '+' ->{
//			val = a + b;
//		}
//		
//		
//		case '-' ->{
//			val = a - b;
//		}
//		
//		case '*' ->{
//			val = a * b;
//		}
//		
//		case '/' ->{
//			val = a / b;
//		}
//		}
//		
//		return val;
//	}

	void stageThree(int a[], int val, int val1, int val2, int val3, String c1, String c2) {

		String c3 = "";
		boolean flag = false;

		int x = (val * 10) + a[3];

		if (val + a[3] == target) {
			c3 = "+";
			flag = true;
			//System.out.println(val + "plus");
		}

		else if (val - a[3] == target) {
			c3 = "-";
			flag = true;
			//System.out.println(val + "minus");
		}

		else if (val * a[3] == target) {
			//System.out.println(val + "mul");
			c3 = "*";
			flag = true;
		} else if (val >= a[3] && val % a[3] == 0 && val / a[3] == target) {
			//System.out.println(val + "divide");
			c3 = "/";
			flag = true;
		}

		else if (x == target) {
			c3 = "";
			flag = true;
			//System.out.println(x);
		}

		if (flag) {
			ans = "" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + c2 + (char) ('0' + val3) + c3
					+ (char) ('0' + a[3]);
			System.out.println(ans);
			System.exit(0);
		}
	}

	void stageTwo(int a[], int val, int val1, int val2, String c1) {
		stageThree(a, val + a[2], val1, val2, a[2], c1, "+");
		stageThree(a, val - a[2], val1, val2, a[2], c1, "-");
		stageThree(a, val * a[2], val1, val2, a[2], c1, "*");

		if (val >= a[2] && val % a[2] == 0) {
			stageThree(a, val / a[2], val1, val2, a[2], c1, "/");
		}

		int x = (val * 10) + a[2];

		stageThree(a, x, val1, val2, a[2], c1, "");

	}

	void stageOne(int a[]) {

		stageTwo(a, a[0] + a[1], a[0], a[1], "+");
		stageTwo(a, a[0] - a[1], a[0], a[1], "-");
		stageTwo(a, a[0] * a[1], a[0], a[1], "*");

		if (a[0] >= a[1] && a[0] % a[1] == 0) {
			stageTwo(a, a[0] / a[1], a[0], a[1], "/");
		}

		int x = (a[0] * 10) + a[1];

		stageTwo(a, x, a[0], a[1], "");

	}

	void step4(int a[], int temp[], int index1, int index2, int index3) {
		
		for (int i = 0; i < 4; i++) {
			if (i != index1 && i != index2 && i != index3) {
				temp[3] = a[i];
				stageOne(temp);			
			}
		}	
	}

	void step3(int a[], int temp[], int index1, int index2) {

		for (int i = 0; i < 4; i++) {

			if (i != index1 && i != index2) {
				temp[2] = a[i];
				step4(a, temp, index1, index2, i);
			}
		}
	}

	void step2(int a[], int temp[], int index1) {

		for (int i = 0; i < 4; i++) {
			if (i != index1) {

				temp[1] = a[i];
				step3(a, temp, index1, i);

			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a[] = new int[4];

		System.out.println("enter the four values: ");

		for (int i = 0; i < 4; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println("enter the target value: ");
		target = scan.nextInt();

		int temp[] = new int[4];

		Game obj = new Game();
		for (int i = 0; i < 4; i++) {
			temp[0] = a[i];
			obj.step2(a, temp, i);

		}

		System.out.println("equation = " + ans);

	}

}
