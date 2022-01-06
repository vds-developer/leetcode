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
        ListNode pointer1 = null, pointer2 = null, prev = null;
        pointer1 = head;
        for (int i = 0; i < n; i++) {
            if (pointer2 == null) pointer2 = head;
            else pointer2 = pointer2.next;
        }
        while (pointer2 != null && pointer2.next != null) {
            pointer2 = pointer2.next;
            prev = pointer1;
            pointer1 = pointer1.next;
        }
        if (prev == null) return head.next;
        prev.next = pointer1.next;
        return head;

    }
}