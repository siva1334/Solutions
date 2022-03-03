package com.practice;

interface Int{
	void fun();
}
 enum Level implements Int {
	EASY{
		void fun2() {
			
		}
		}
	
	,MEDIUM{
		void fun2() {
			
		}
		}
	,HARD{
		void fun2() {
			
		}
		void demo() {
			
		}
	};
	public void fun() {
		System.out.println("function 1");
	}
	
	
	private Level() {
		System.out.println("contructor called");
	}
	abstract void fun2();
}

public class EnumDemo  {

	public static void main(String[] args) {
		
		Level obj = Level.HARD;
			
		
		Level obj2  = obj.EASY ;
		
		Level[] l = Level.values();
		for(int i = 0; i < l.length; i++)
		System.out.println(l[i]);
  
		obj2.fun();
	}

}
