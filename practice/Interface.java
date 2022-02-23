package com.practice;

import java.util.Scanner;

interface Calender{	
	public void assignDob(Form obj);			
}


class Form {
	private String name;
	private String email;
	private String dob;

	void readInput() {
		Scanner scan = new Scanner(System.in);
		name = scan.next();
		email = scan.next();
		
	Calender c =new Calender() {
				public void assignDob(Form obj) {	
					obj.dob = "03-06-1999";
				}		
			};
		
	c.assignDob(this);
	
	}
	
	void getdetail() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(dob);
	}
}

public class Demo {
public static void  main(String[] args) {	
	Form user1 = new Form();
	user1.readInput();
	user1.getdetail();
}
}
