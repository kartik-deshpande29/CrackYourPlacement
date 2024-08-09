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
    public void reverseList(ListNode head) {      
        ListNode prev = null;
        ListNode current = head;
        ListNode Next = null;

        while (current != null) {
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null || left == right) return head;
        ListNode leftOfLeft = null;
        ListNode leftNode = null;
        ListNode rightNode = null;
        ListNode rightOfRight = null;
        ListNode headTemp = head;

        ListNode temp = head;
        int pos = 1;
        while (temp != null) {
            if (pos == left - 1) leftOfLeft = temp;
            if (pos == left) leftNode = temp;
            if (pos == right) rightNode = temp;
            if (pos == right + 1) rightOfRight = temp;
            temp = temp.next;
            pos++;
        }
        //divided the LL into three parts
        if (leftOfLeft != null) leftOfLeft.next = null;
        if (rightNode != null) rightNode.next = null;

        //reversing the part from left to right
        reverseList(leftNode);

        //connecting all the LL together again
        if (leftOfLeft != null) leftOfLeft.next = rightNode;
        leftNode.next = rightOfRight;

        if (leftOfLeft == null) return rightNode;
        return head;

    }
}