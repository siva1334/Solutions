/*
Given the head of a sorted linked list, 
delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list. Return the linked list sorted as well.
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
    
    ListNode remove(ListNode head){
        
        if(head == null || head.next == null)return head;
        
        if(head.val == head.next.val){
            
            int value = head.val;
            
          while(head != null && head.val == value)
                head = head.next;
                        
            return remove(head);
        }
        
        else{
            head.next = remove(head.next);
            return head;
        }
        
    }
    public ListNode deleteDuplicates(ListNode head) {
        
        return remove(head);
        
    }
}
