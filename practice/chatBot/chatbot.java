package com.chatBot;
import java.util.Scanner;

public class Menu {

	private Scanner scan = new Scanner(System.in);


	public void mainMenu() {

		while(true) {
			System.out.println("enter 1 for TAMIL: ");
			System.out.println("enter 2 for ENGLISH: ");
			System.out.println("enter 3 to exit: ");
			int val = scan.nextInt();
			boolean signal = false; 

			switch(val) {
			case 1 ->{
				tamilMenu();
			}
			case 2 ->{
				englishMenu();
			}

			case 3 ->{
				signal = true;
			}

			default -> {
				System.out.println("INVALID KEY");
			}
			}

			if(signal)break;

		}

	}

	public void englishMenu() {

		while(true) {
			System.out.println("enter 1 for balance detail: ");
			System.out.println("enter 2 for recharhge: ");
			System.out.println("enter 3 to view mobile number: ");
			System.out.println("enter 4 to go back: ");
			int val = scan.nextInt();
			boolean signal = false; 

			switch(val) {
			case 1 ->{
				System.out.println("your balance is 115rs");
			}
			case 2 ->{
				rechargePlan();
			}

			case 3 ->{
				System.out.println("number is 9797567442");
			}

			case 4 ->{
				signal = true;
			}
			default -> {
				System.out.println("INVALID KEY");
			}
			}

			if(signal)break;

		}
	}


	public void tamilMenu() {

		while(true) {
			System.out.println("balance vivarangalukku 1 aluthavum: ");
			System.out.println("recharge kku 2 aluthavum: ");
			System.out.println("mobile number parka 3 aluthavum ");
			System.out.println("pin sella 4 aluthavum: ");
			int val = scan.nextInt();
			boolean signal = false; 

			switch(val) {
			case 1 ->{
				System.out.println("ungal balance 115rs");
			}
			case 2 ->{
				rechargePlan();
			}

			case 3 ->{
				System.out.println(" ungal mobile number: 9797567442");
			}

			case 4 ->{
				signal = true;
			}
			default -> {
				System.out.println("INVALID KEY");
			}
			}

			if(signal)break;

		}
	}

	public void rechargePlan() {
		while(true) {

			System.out.println("press 1 to for plan 599");
			System.out.println("press 2 to for plan 299");
			System.out.println("press 3 to for plan 999");
			System.out.println("press 4 to go back");
			int val = scan.nextInt();

			boolean signal = false;
			switch(val) {
			case 1 ->{
				System.out.println("recharge for 599 is succesful");
			}
			case 2 ->{
				System.out.println("recharge for 299 is succesful");
			}

			case 3 ->{
				System.out.println("recharge for 999 is succesful");
			}

			case 4 ->{
				signal = true;
			}
			default -> {
				System.out.println("INVALID KEY");
			}
			}

			if(signal)break;

		}

	}
}
