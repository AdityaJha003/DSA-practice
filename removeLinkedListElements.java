// https://leetcode.com/problems/remove-linked-list-elements/
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]

public class removeLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
    
        for (; head != null; head = head.next)
          if (head.val != val) {
            prev.next = head;
            prev = prev.next;
          }
        prev.next = null; // In case that the last value equals `val`.
    
        return dummy.next;
      }
      public static void main(String[] args) {
        removeLinkedListElements r = new removeLinkedListElements();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        int val = 6;
        ListNode result = r.removeElements(head, val);
        while (result != null) {
          System.out.print(result.val + " ");
          result = result.next;
        }
      }
}
