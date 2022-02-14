package com.Leetcode;

import java.util.Scanner;

/*
 * Given the head of a linked list, reverse the nodes of the list k at a time,
 *  and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list.
 If the number of nodes is not a multiple of k then left-out nodes,
  in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 
 */
 
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
	
    ListNode ReverseList(ListNode start,int length,int currentSize, int k){
    	
       if(currentSize + k > length || k == 1)
           return start;
       
            
        ListNode prev = start;
        ListNode current = start.next;
        ListNode next = null;
        int size = 1;
        while(size < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            ++size;
        }
         start.next = ReverseList(current , length, currentSize + k, k);
        return prev;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            ++length;
        }
        return ReverseList(head , length, 0, k);
    }
    }
public class ReverseNodes {
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the list: ");
		
		
		int size = scan.nextInt();
		
		System.out.println("enter the k: ");
		int k = scan.nextInt();
		
		ListNode head = new ListNode();
		ListNode temp = head;
		
		for(int i = 0; i < size; i++) {
			temp.val = scan.nextInt();
			temp.next = new ListNode();
			temp = temp.next;
		}
		
		Solution obj = new Solution();
		head = obj.reverseKGroup(head,k);
	}

}
