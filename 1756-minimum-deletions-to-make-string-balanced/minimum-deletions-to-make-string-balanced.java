class Solution {
    public int minimumDeletions(String s) {
        int b_count = 0;
        int deletions = 0;
        
        for (char c : s.toCharArray()) {
            if (c == 'b') {
                b_count++;
            } else {
                // 'a' found: we can either delete this 'a' (increment deletions)
                // or we can consider deleting all previous 'b's.
                deletions = Math.min(deletions + 1, b_count);
            }
        }
        
        return deletions;
    }
}