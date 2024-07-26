class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArr = new int[m];
        for (int x = 0; x < m; x++) {
            newArr[x] = nums1[x];
        }

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (newArr[i] < nums2[j]) {
                nums1[k] = newArr[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from newArr if any
        while (i < m) {
            nums1[k] = newArr[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2 if any
        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}
