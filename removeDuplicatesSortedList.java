// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
// Input: head = [1,1,2,3,3]
// Output: [1,2,3]


import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class removeDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        removeDuplicatesSortedList s = new removeDuplicatesSortedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = s.deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
