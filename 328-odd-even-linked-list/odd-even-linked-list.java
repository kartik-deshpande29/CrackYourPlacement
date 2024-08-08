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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-2);
        ListNode temp = head;
        ListNode head1 = dummy1;
        ListNode head2 = dummy2;

        int size = 0;

        while (temp != null) {
            size++;
            if (size % 2 != 0) {
                head1.next = temp;
                head1 = head1.next;
                temp = temp.next;
            }
            else {
                head2.next = temp;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        head2.next = null;
        head1.next = dummy2.next;
        return dummy1.next;
    }
}