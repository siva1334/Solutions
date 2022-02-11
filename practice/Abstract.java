package com.copy;
/*
 * practice about abstract classes and interfaces
 */
import java.util.Scanner;
interface Dd{
	
	
	default  void fun() {
		 
	 }
		 
	 
	
}

abstract class  Aa{
	int x;
	abstract void fun();
	void display() {
		System.out.println("display");
	}
			
}
class Bb extends Aa{
	int y;
	void fun(){
		System.out.println("Bb");
	}
	void displa() {
		System.out.println("xx");
	}
}
public class Abstract {
	public static void  main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Aa obj = new Bb();
		obj.x= 10;
		obj.fun();
		obj.display();
		System.out.println(obj.x);
	}

}
