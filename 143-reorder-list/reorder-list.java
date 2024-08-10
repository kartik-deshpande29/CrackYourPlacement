class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n = 0;

        while (temp != null) {
            n++;
            temp = temp.next;
        }

        temp = head;
        int i = 0;
       
        while (i < n / 2) { 
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        }
        return prev; 
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return; 

        ListNode leftMiddle = middleNode(head);
        ListNode head2 = leftMiddle.next;
        leftMiddle.next = null;

        head2 = reverseList(head2);

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (head != null && head2 != null) {
            temp.next = head;
            head = head.next;
            temp = temp.next;
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        if (head == null) temp.next = head2;
        else temp.next = head;

        head = dummy.next;

    }
}
