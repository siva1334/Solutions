/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
*/

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        do{
            if(first == null || second.next == null || second.next.next == null){
                return false;
            }
            first = first.next;
            second = second.next.next;
        }while(first != second);
        return true;
    }
}
