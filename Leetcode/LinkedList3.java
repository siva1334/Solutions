/*
 * Given the head of a singly linked list and 
 * two integers left and right where left <= right,
 * reverse the nodes of the list from position left to position right, 
 * and return the reversed list.

 
 */

package com.Leetcode;

import java.util.Scanner;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    private ListNode reverseList(ListNode head, int left, int right){
        if(left == right)
            return head;
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = null;
        while(left < right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            left++;
        }
        head.next = curr;
        return prev;
        
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(right == left)
            return head;
        
        
        ListNode ans = head;
        ListNode prev = head;
        int position = 1;
        
        while(position < left){
            prev = head;
            head = head.next;
            position++;
        }
        if(position == 1)
            ans = reverseList(head,left,right);
        else
       prev.next = reverseList(head,left,right);
        
        return ans;
    }
}

public class LinkedList3 {
	

public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of the list: ");
		int n  = scan.nextInt();
  
		System.out.println("enter the start position: ");
		int left = scan.nextInt();
  
		System.out.println("enter the end position: ");
		int right = scan.nextInt();
  
		ListNode head = new ListNode();
		ListNode temp = head;
  
		System.out.println("enter the values of the list: ");
		for(int i = 0; i < n; i++) {
			temp.val = scan.nextInt();
			temp.next = new ListNode();
			temp = temp.next;
		}
  
		Solution obj = new Solution();
		
		head = obj.reverseBetween(head,left,right);
		
		for(int i = 0; i < n; i++) {
			System.out.print(head.val + " ");
			head = head.next;
		}
}
}
