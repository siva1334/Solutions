package com.Leetcode;

import java.util.Scanner;
/*
 
  You are given an array of k linked-lists lists,
 
  each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 */
class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
   public ListNode merge(ListNode head1, ListNode head2){
        
        ListNode ans = null;
       
       if(head1 == null || head2 == null ){
           
           if(head1 == null && head2 == null)
               return null;
           
           else if(head1 == null){
               ans = head2;
               head2 = head2.next;
           }
           
           else{
               ans = head1;
               head1 = head1.next;
           }
           
       }
       
       else{
           
        if(head1.val < head2.val){
            ans = head1;
            head1 = head1.next;
        }
           
        else{
            ans = head2;
            head2 = head2.next;
        }
       }
         ListNode head = ans;
        
        
    while(head1 != null && head2 != null){
        
        if(head1.val < head2.val){
            ans.next = head1;
            ans = ans.next;
            head1 = head1.next;
        }
        else{
            ans.next = head2;
            ans = ans.next;
            head2 = head2.next;
        }
    }
             
    while(head1 != null){                
            ans.next = head1;
            ans = ans.next;
            head1 = head1.next;       
    }
        while(head2 !=null){
            ans.next = head2;
            ans = ans.next;
            head2 = head2.next;
        }
        return head;
    }
    public ListNode split(ListNode[] lists, int start,int end){
       if(start == end)
         return lists[start];
        
        int mid = (start+end) / 2;
        
      ListNode head1 = split(lists, start, mid);
      
      ListNode head2 = split(lists, mid+1, end);
      
        return merge(head1, head2);
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;
        
        return split(lists, 0, lists.length - 1);
    }
}

public class MergeLinkedLists {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		
		

}
}
