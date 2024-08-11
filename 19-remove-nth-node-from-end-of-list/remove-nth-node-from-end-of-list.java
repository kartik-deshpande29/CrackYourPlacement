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
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int nFromHead = size - n + 1;
        
        if (nFromHead == 1) return head.next;
        temp = head;

        for (int i = 1; i < nFromHead-1; i++) {
            temp = temp.next;
        }

        if (temp.next != null) temp.next = temp.next.next;

        return head;
        

    }
}