package com.queue;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Manage {

	void function() {
		
		Scanner scan = new Scanner(System.in);
		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		
			System.out.println("enter the total size: ");
			int n = scan.nextInt();
			
			for(int i  = 1; i <= n; i++) {
				q2.add(i);
			}
			
			System.out.println("enter the size of the reception: ");
			int m = scan.nextInt();
			
			for(int i  = 0; i < m; i++) {
				if(q2.peek() == null) {
					break;
				}
				q1.add(q2.poll());
			}
			
			while(q1.peek() != null) {
				System.out.println("enter any key to allow next participant");
				scan.next();
				System.out.println("current candidate " + q1.poll());
				
				if(q2.peek() != null) {
					q1.add(q2.poll());
				}
			}
			
			scan.next();
			System.out.println("all participants are interviewed");
		
		
	}
}
