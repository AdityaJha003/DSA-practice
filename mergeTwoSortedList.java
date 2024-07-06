// https://leetcode.com/problems/merge-two-sorted-lists/description/
// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]

import java.util.*;

public class mergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
          return list1 == null ? list2 : list1;
        if (list1.val > list2.val) {
          ListNode temp = list1;
          list1 = list2;
          list2 = temp;
        }
        list1.next = mergeTwoLists(list1.next, list2);
        return list1;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        mergeTwoSortedList m = new mergeTwoSortedList();
        ListNode result = m.mergeTwoLists(list1, list2);
        while (result != null) {
          System.out.print(result.val + " ");
          result = result.next;
        }
      }
      static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
          
}
