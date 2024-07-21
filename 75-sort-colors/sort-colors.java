class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        while (n != 0) {
            for (int i = 0; i < arr.length - 1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            n--;
        }
    }
}