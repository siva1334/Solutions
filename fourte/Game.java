package com.fourte;



public class Game {

	int target;
	String ans = "";

	void stageThree(int a[], int val, int val1, int val2, int val3, String c1, String c2, boolean signal) {

		String c3 = "";
		boolean flag = false;

		int x = (val * 10) + a[3];

		if (val >= a[3] && val % a[3] == 0 && val / a[3] == target) {

			c3 = "/";
			flag = true;
		}

		else if (val * a[3] == target) {

			c3 = "*";
			flag = true;
		} else if (val + a[3] == target) {
			c3 = "+";
			flag = true;

		}

		else if (val - a[3] == target) {
			c3 = "-";
			flag = true;

		}

		else if (x == target && signal) {
			c3 = "";
			flag = true;

		}

		if (flag) {
//			ans = "" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + c2 + (char) ('0' + val3) + c3
//					+ (char) ('0' + a[3]);

			if (c3 == "") {
				ans = "" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + c2 + (char) ('0' + val3) + c3
						+ (char) ('0' + a[3]);
			} else if (c2 == "") {
				ans = "" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + c2 + (char) ('0' + val3) + c3
						+ (char) ('0' + a[3]);
			} else if (c1 == "") {
				ans = "" + "(" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + c2 + (char) ('0' + val3) + ")" + c3
						+ (char) ('0' + a[3]);
			} else {
				ans = "" + "(((" + (char) ('0' + val1) + c1 + (char) ('0' + val2) + ")" + c2 + (char) ('0' + val3) + ")"
						+ c3 + (char) ('0' + a[3]) + ")";
			}

			System.out.println("equation = " + ans);
			//System.exit(0);

		}
	}

	void stageTwo(int a[], int val, int val1, int val2, String c1, boolean signal) {

		CrossCheck obj = new CrossCheck(target);
		obj.crossCheck(a, val, val1, val2, c1);
		

		if (val >= a[2] && val % a[2] == 0) {
			stageThree(a, val / a[2], val1, val2, a[2], c1, "/", false);
		}

		stageThree(a, val * a[2], val1, val2, a[2], c1, "*", false);
		stageThree(a, val + a[2], val1, val2, a[2], c1, "+", false);
		stageThree(a, val - a[2], val1, val2, a[2], c1, "-", false);

		if (signal) {
			int x = (val * 10) + a[2];
			stageThree(a, x, val1, val2, a[2], c1, "", true);
		}

	}

	void stageOne(int a[]) {
		if (a[0] >= a[1] && a[0] % a[1] == 0) {
			stageTwo(a, a[0] / a[1], a[0], a[1], "/", false);
		}

		stageTwo(a, a[0] * a[1], a[0], a[1], "*", false);
		stageTwo(a, a[0] + a[1], a[0], a[1], "+", false);
		stageTwo(a, a[0] - a[1], a[0], a[1], "-", false);

		int x = (a[0] * 10) + a[1];

		stageTwo(a, x, a[0], a[1], "", true);

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

}
