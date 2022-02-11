package com.copy;
/*
 * practice about multilevel inheritance
 */
import java.util.Scanner;
class X {
	int x;
	X(){
		System.out.println("X constructor");
	}
	void display() {
		System.out.println("X");
	}	
 }

	 class A extends X{
		int x;
		A(){
			System.out.println("A constructor");
		}
		void  display() {
			System.out.println("A");
		}
	  final	void fun() {
			System.out.println("final");
		}
	}
	class B extends A{
		int y;
		B(){
			super();
			System.out.println("B construnctor");
		}
		void display() {
			System.out.println("B");
			
		}
	}

	public class Inherit {
		public static void  main(String[] args) {	
			
			Scanner scan = new Scanner(System.in);
			X obj = new A();
			obj.display();
			
		}
	}

