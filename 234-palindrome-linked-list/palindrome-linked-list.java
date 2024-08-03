class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return false;
        List<Integer> list = new ArrayList<>();
        List<Integer> rev = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode Next = null;

        while (current != null) {
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        temp = prev;
        int size = 0;
        while (temp != null) {
            size++;
            rev.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0; i < size; i++) {
            if (list.get(i) != rev.get(i)) {
                return false;
            }
        }
        return true;

    }
}