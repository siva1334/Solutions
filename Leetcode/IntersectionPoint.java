/*
Given the heads of two singly linked-lists headA and headB, 
return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null.

For example, the following two linked lists begin to intersect at node
*/
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ans = null;
        ListNode temp = headA;
        while(temp != null){
            temp.val *= -1;
            temp = temp.next;
        }
        temp = headB;
          
        while(temp != null){
            if(temp . val < 0){
                ans = temp;
                break;
            }
            temp = temp.next;
        }
        temp = headA;
        while(temp != null){
            temp.val *= -1;
            temp = temp.next;
        }
        
        return ans;
        
    }
}
