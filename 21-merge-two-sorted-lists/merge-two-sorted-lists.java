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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return list1;
        }

        if (list1 == null && list2 != null) {
            return list2;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode tempA = list1;
        ListNode tempB = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (tempA != null && tempB != null) {
            if (tempA.val <= tempB.val) {
                temp.next = tempA;
                tempA = tempA.next;
            }
            else {
                temp.next = tempB;
                tempB = tempB.next;
            }
            temp = temp.next;
        }

        if (tempA == null) {
            temp.next = tempB;
        }
        else {
            temp.next = tempA;
        }

        return dummy.next;
    }
}