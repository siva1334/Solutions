package com.practice;

public class CrossCheck {

	int target;

	CrossCheck(int t) {
		target = t;
	}

	void plus(int a[], int val, int val1, int val2, String c1) {

		String temp = "equation = ";

		if (val + (a[2] + a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "+" + "(" + a[2] + "+" + a[3] + ")";
		}
		if (val + (a[2] - a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "+" + "(" + a[2] + "-" + a[3] + ")";
		}
		if (val + (a[2] * a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "+" + "(" + a[2] + "*" + a[3] + ")";
		}
		if (a[2] >= a[3] && a[2] % a[3] == 0 && val + (a[2] / a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "+" + "(" + a[2] + "/" + a[3] + ")";
		}
		int x = (a[2] * 10) + a[3];
		if (val + x == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "+" + "(" + a[2] + "" + a[3] + ")";
		}

		if (!temp.equals("equation = ")) {
			System.out.println(temp);
			System.exit(0);
		}

	}

	void minus(int a[], int val, int val1, int val2, String c1) {
		String temp = "equation = ";

		if (val - (a[2] + a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "-" + "(" + a[2] + "+" + a[3] + ")";
		}
		if (val - (a[2] - a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "-" + "(" + a[2] + "-" + a[3] + ")";
		}
		if (val - (a[2] * a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "-" + "(" + a[2] + "*" + a[3] + ")";
		}
		if (a[2] >= a[3] && a[2] % a[3] == 0 && val - (a[2] / a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "-" + "(" + a[2] + "/" + a[3] + ")";
		}
		int x = (a[2] * 10) + a[3];
		if (val - x == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "-" + "(" + a[2] + "" + a[3] + ")";
		}

		if (!temp.equals("equation = ")) {
			System.out.println(temp);
			System.exit(0);
		}

	}

	void multiple(int a[], int val, int val1, int val2, String c1) {

		String temp = "equation = ";

		if (val * (a[2] + a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "*" + "(" + a[2] + "+" + a[3] + ")";
		}
		if (val * (a[2] - a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "*" + "(" + a[2] + "-" + a[3] + ")";
		}
		if (val * (a[2] * a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "*" + "(" + a[2] + "*" + a[3] + ")";
		}
		if (a[2] >= a[3] && a[2] % a[3] == 0 && val * (a[2] / a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "*" + "(" + a[2] + "/" + a[3] + ")";
		}
		int x = (a[2] * 10) + a[3];
		if (val * x == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "*" + "(" + a[2] + "" + a[3] + ")";
		}

		if (!temp.equals("equation = ")) {
			System.out.println(temp);
			System.exit(0);
		}

	}

	void divide(int a[], int val, int val1, int val2, String c1) {

		String temp = "equation = ";

		if (val >= (a[2] + a[3]) && val % (a[2] + a[3]) == 0 && val / (a[2] + a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "/" + "(" + a[2] + "+" + a[3] + ")";
		}
		if (a[2] > a[3] && val >= (a[2] - a[3]) && val % (a[2] - a[3]) == 0 && val / (a[2] - a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "/" + "(" + a[2] + "-" + a[3] + ")";
		}
		if (val >= (a[2] * a[3]) && val % (a[2] * a[3]) == 0 && val / (a[2] * a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "/" + "(" + a[2] + "*" + a[3] + ")";
		}
		if (a[2] >= a[3] && a[2] % a[3] == 0 && val >= (a[2] / a[3]) && val % (a[2] / a[3]) == 0
				&& val / (a[2] / a[3]) == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "/" + "(" + a[2] + "/" + a[3] + ")";
		}
		int x = (a[2] * 10) + a[3];
		if (val >= x && val % x == 0 && val / x == target) {
			temp += "(" + val1 + c1 + val2 + ")" + "/" + "(" + a[2] + "" + a[3] + ")";
		}

		if (!temp.equals("equation = ")) {
			System.out.println(temp);
			System.exit(0);
		}
	}

	void crossCheck(int a[], int val, int val1, int val2, String c1) {
		plus(a, val, val1, val2, c1);
		minus(a, val, val1, val2, c1);
		multiple(a, val, val1, val2, c1);
		divide(a, val, val1, val2, c1);

	}

}
