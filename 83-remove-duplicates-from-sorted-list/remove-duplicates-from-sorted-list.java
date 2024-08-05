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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode a = head;
        ListNode b = head;

        while (b != null) {
            if (b.val == a.val) b = b.next;
            else {
                a.next = b;
                a = b;
            }
        }
        a.next = b;
        return head;



        // HashSet<Integer> set = new HashSet<>();
        // ListNode current = head;
        // ListNode prev = null;

        // while (current != null) {
        //     if (set.contains(current.val)) {
        //         prev.next = current.next;
        //     }
        //     else {
        //         set.add(current.val);
        //         prev = current;
        //     }
        //     current = current.next;
        // }
        // return head;
    }
}