class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

        // int sum = 0;
        // ArrayList<Integer> idx = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             idx.add(i);
        //             idx.add(j);
        //             break;
        //         }
        //     }
        // }
        // int[] res = new int[idx.size()];
        // for (int i = 0; i < idx.size(); i++) {
        //     res[i] = idx.get(i);
        // }
        // return res;
    }
}