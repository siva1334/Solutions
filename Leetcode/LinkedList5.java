package com.practice;
/*
 * Given a linked list, swap every two adjacent nodes and return its head.
 *  You must solve the problem without modifying the values in the list's nodes 
 *  (i.e., only nodes themselves may be changed.)
 */
import java.util.Scanner;

class ListNode {
     int val;
     ListNode next;
 		ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
       
        ListNode temp = null;
        ListNode first = head;
        ListNode second = head.next;
        ListNode ans = head.next;
       
        while(first != null && first.next != null){
        	
            temp = second.next;
            second.next = first;
            
            if(temp == null || temp.next == null){
                
                first.next = temp;
                first = temp;
               
            }
            else{
            first.next = temp.next;
            first = temp;
            second = temp.next;
            }
        }
        return ans;
    }
}
public class Demo {
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		ListNode head = new ListNode();
		head.val = 1;
		head.next = new ListNode();
		head.next.val=2;
		head.next.next=null;
		Solution obj = new Solution();
		ListNode res = obj.swapPairs(head);
		System.out.println(res.val);
}
}
