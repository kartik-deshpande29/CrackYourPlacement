class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    







        // if (n == 1) return;

        // while (n != 0) {
        //     for (int i = 0; i < nums.length - 1; i++) {
        //         if (nums[i] == 0) {
        //             nums[i] = nums[i+1];
        //             nums[i+1] = 0;
        //         }
        //     }
        //     n--;
        // }
    }
}