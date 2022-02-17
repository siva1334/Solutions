package com.Leetcode;

import java.util.Scanner;
/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 *  Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int rem = 0;
        while(l1 != null && l2 != null){
            
            int val = l1.val + l2.val +rem;
             temp.val = val % 10;
            rem = val / 10;  
           
            l1 = l1.next;
            l2 = l2.next;
            if(l1 != null || l2 != null){
            temp.next = new ListNode();
             temp = temp.next;
        }
            
        }
        while(l1 != null){
            int val = l1.val + rem;
            temp.val = val % 10;
            rem = val / 10;
            
            l1 = l1.next;
            if(l1 != null){
                temp.next = new ListNode();
             temp = temp.next;
            }
        }
        while(l2 != null){
            int val = l2.val + rem;
            temp.val = val % 10;
            rem = val / 10;
            
            l2 = l2.next;
            if(l2 != null){
                temp.next = new ListNode();
             temp = temp.next;
            }
        }
        
        if (rem > 0){
            temp.next = new ListNode();
             temp = temp.next;
            temp.val = rem;
        }
        
        return head;
    }
}
public class AddTwoNumbers {
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		
		
}
}
