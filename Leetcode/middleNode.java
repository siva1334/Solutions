
/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
*/

 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        int middle = len / 2;
        len = 0;
        while(len < middle){
        head = head.next;
            len++;
        }
        return head;
        
    }
}
public class Main {
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
		ListNode middle = obj. middleNode(head);
	}

}
