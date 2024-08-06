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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode slow = head;
        ListNode fast = head;
        k = k % size;
        if (k == 0) return head;

        for (int i = 0; i < k; i++) { //fast is moved by k steps
            fast = fast.next;
        }
        while (fast.next != null) {  //fast is now at tail
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;   //slow is the new tail
        fast.next = head;

        return newHead;

    }
}