/*
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
*/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
  
        ListNode  temp = head;
        int k1 = 1;
        while(k1 < k){
            temp = temp.next;
            k1++;
        }
        
        k1 = 1;
        ListNode p1 = temp;
        ListNode p2 = head;
        
       while(p1.next != null){
           p1 = p1.next;
           p2 = p2.next;
       }
        
        int tempValue = temp.val;
        temp.val = p2.val;
        p2.val = tempValue;
        
        return head;
        
        
    }
}
