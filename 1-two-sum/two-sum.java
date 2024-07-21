class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        ArrayList<Integer> idx = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    idx.add(i);
                    idx.add(j);
                    break;
                }
            }
        }
        int[] res = new int[idx.size()];
        for (int i = 0; i < idx.size(); i++) {
            res[i] = idx.get(i);
        }
        return res;
    }
}