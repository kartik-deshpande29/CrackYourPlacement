class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split("\\s+");
        int i = arr.length - 1;

        while (i >= 0) {
            sb.append(arr[i]);
            if (i > 0) {  // only append a space if not the last word
                sb.append(" ");
            }
            i--;
        }

        return sb.toString();
    }
}