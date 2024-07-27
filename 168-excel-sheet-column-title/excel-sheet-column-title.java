class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Decrease columnNumber by 1 to make it 0-indexed
            char ch = (char) ('A' + (columnNumber % 26));
            sb.append(ch);
            columnNumber /= 26;
        }
        sb.reverse(); // Reverse the string to get the correct result
        return sb.toString();
    }
}
