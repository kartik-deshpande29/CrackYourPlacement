class Solution {
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        // The loop continues as long as left is less than right.
        // If the characters at the left and right pointers are not equal, we have a mismatch.
        // In case of a mismatch, we check two possibilities:
        // Removing the character at the left pointer.
        // Removing the character at the right pointer.
        // If either of these resulting substrings is a palindrome, we return true.

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
}