class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hp = new HashMap<>(); //<key:value> <element:index>

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (hp.containsKey(diff)) {
                return new int[] {i, hp.get(diff)};
            }
            else {
                hp.put(nums[i], i);
            }
        }

        return new int[] {};
        
    }
}