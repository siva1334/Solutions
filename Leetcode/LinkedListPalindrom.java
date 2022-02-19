/*
Given the head of a singly linked list, return true if it is a palindrome.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode reverse( ListNode head){
        
        ListNode prev = head;
         ListNode curr = head.next;
         ListNode  next;
        head.next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow =  head;
         ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
         ListNode  mid = reverse(slow);
    
    while(mid != null){
        if(head.val != mid.val)
            return false;
        head = head.next;
        mid = mid.next;
    }
    return true;
}
}
