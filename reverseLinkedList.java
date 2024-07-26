// https://leetcode.com/problems/reverse-linked-list/description/
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reverseLinkedList obj = new reverseLinkedList();
        ListNode result = obj.reverseList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
