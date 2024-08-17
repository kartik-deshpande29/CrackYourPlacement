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
    public int lengthOfList(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    // Corrected method to handle potential IndexOutOfBoundsException
    public ListNode[] listToArray(ArrayList<ListNode> al, ListNode[] arr) {
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = lengthOfList(head);
        int size = n / k;   // base size of each part
        int extra = n % k;   // extra nodes to distribute

        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        int len = 1;

        while (temp != null) {
            int s = size;
            if (extra > 0) s++;
            if (len == 1) arr.add(temp);
            if (len == s) {
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                len = 1;
                extra--;
            } else {
                len++;
                temp = temp.next;
            }
        }

        ListNode[] ans = new ListNode[k];
        return listToArray(arr, ans);
    }
}
