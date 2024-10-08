class Solution {
    public void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (j > i) {
            swap(s, i, j);
            i++;
            j--;
        }
    }
}