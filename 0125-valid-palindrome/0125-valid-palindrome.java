class Solution {
    private static boolean isAlphaNumeric(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(" ")) {
            return true;
        }
        System.out.println(s);
        // Remove spaces
        s = s.replace(" ", "");

        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // Convert to lowercase
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length()-1; i++) {
            char c = sb.charAt(i);
            if(!isAlphaNumeric(c)) {
                sb.deleteCharAt(i);
            }
        }
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}