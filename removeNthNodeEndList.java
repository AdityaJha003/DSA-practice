// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]

public class removeNthNodeEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
    
        while (n-- > 0)
          fast = fast.next;
        if (fast == null)
          return head.next;
    
        while (fast.next != null) {
          slow = slow.next;
          fast = fast.next;
        }
        slow.next = slow.next.next;
    
        return head;
      }
      public static void main(String[] args) {
        removeNthNodeEndList rnne = new removeNthNodeEndList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.println(rnne.removeNthFromEnd(head, n));
      }
}
