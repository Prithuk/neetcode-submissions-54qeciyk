/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 1. Use a Dummy node to handle the "Remove Head" case easily
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 2. Move fast ahead so there's a gap of 'n' between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 3. Move both until fast hits the very end (null)
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 4. Slow is now right BEFORE the node to be deleted
        slow.next = slow.next.next;

        return dummy.next;
    }
}

