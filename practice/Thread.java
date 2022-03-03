package com.practice;
import java.util.*;

class Thread3 extends Thread{
	public void run() {
		for(int i = 1; i <= 10; i++)System.out.println("t3 thread");
	}
}
class Thread1 implements Runnable {
	
	public void run(){
		for(int i = 1; i < 11; i++)
		System.out.println("t2 thread");
	}
}
public class Threaddd {
	
public static void main(String []args) {
	
	Thread1 t1 = new Thread1();
	Thread t2 = new Thread(t1);
	t2.start();
	
	Thread3 t3 = new Thread3();
	t3.start();
	
	for(int i = 1; i <= 10; i++)
		System.out.println("main thread");
	
}

}
