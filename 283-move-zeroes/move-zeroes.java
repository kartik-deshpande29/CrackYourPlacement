class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        while (n != 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    nums[i] = nums[i+1];
                    nums[i+1] = 0;
                }
            }
            n--;
        }
    }
}