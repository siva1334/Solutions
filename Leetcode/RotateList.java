/*
Given the head of a linked list, rotate the list to the right by k places.
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        
        int len = 0;
        ListNode temp = head;
        
        while(temp != null){
            temp = temp.next;
            len++;
        }
        k %= len;
        if(k == 0)
            return head;
        
        ListNode fast = head;
         ListNode slow = head;
            int n = 0;
        
          while(n++ < k)
          fast = fast.next;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        
        return head;
        
        
        
    }
}
