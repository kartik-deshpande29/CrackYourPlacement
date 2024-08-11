/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        //Calculate sizeA and sizeB
        int sizeA = 0, sizeB = 0;

        while (tempA != null) {
            tempA = tempA.next;
            sizeA++;
        }
        while (tempB != null) {
            tempB = tempB.next;
            sizeB++;
        }
        tempA = headA;
        tempB = headB;

        if (sizeA > sizeB) {
            int diff = sizeA - sizeB;
            for (int i = 1; i <= diff; i++) {
                tempA = tempA.next;
            }
        }
        else {
            int diff = sizeB - sizeA;
            for (int i = 1; i <= diff; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}