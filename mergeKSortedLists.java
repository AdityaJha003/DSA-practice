// https://leetcode.com/problems/merge-k-sorted-lists/description/
// Input: lists = [[1,4,5],[1,3,4],[2,6]]
// Output: [1,1,2,3,4,4,5,6]
// Explanation: The linked-lists are:
// [
//   1->4->5,
//   1->3->4,
//   2->6
// ]
// merging them into one sorted list:
// 1->1->2->3->4->4->5->6


import java.util.PriorityQueue;
import java.util.Queue;

public class mergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
    
        for (final ListNode list : lists)
          if (list != null)
            minHeap.offer(list);
    
        while (!minHeap.isEmpty()) {
          ListNode minNode = minHeap.poll();
          if (minNode.next != null)
            minHeap.offer(minNode.next);
          curr.next = minNode;
          curr = curr.next;
        }
    
        return dummy.next;
      }
      public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
    
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
    
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);
    
        mergeKSortedLists obj = new mergeKSortedLists();
        ListNode result = obj.mergeKLists(lists);
    
        while (result != null) {
          System.out.print(result.val + " ");
          result = result.next;
        }
      }
}
