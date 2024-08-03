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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;




        // ListNode tempHead = head;
        // ListNode tail = head;
        // int size = 0;
        // while (tail.next != null) {
        //     size++;
        //     tail = tail.next;
        // }
        // int i = 0, j = size;

        // while (j > i) {
        //     int temp = tempHead.val;
        //     tempHead.val = tail.val;
        //     tail.val = temp;
        //     i++;
        //     j--;
        // }
        // return head;
    }
}