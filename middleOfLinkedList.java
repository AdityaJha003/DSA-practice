// https://leetcode.com/problems/middle-of-the-linked-list/

// Input: head = [1,2,3,4,5]
// Output: [3,4,5]
// Explanation: The middle node of the list is node 3.

// Input: head = [1,2,3,4,5,6]
// Output: [4,5,6]
// Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


public class middleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
        }
    
        return slow;
      }
      public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        middleOfLinkedList obj = new middleOfLinkedList();
        System.out.println(obj.middleNode(head).val);
      }
}
