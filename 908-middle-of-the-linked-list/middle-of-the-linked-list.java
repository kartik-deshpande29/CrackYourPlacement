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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n = 0;
        while(temp.next != null) {
            n++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;
        while (i < (n+1)/2) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
}