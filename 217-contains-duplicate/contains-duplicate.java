class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean visited = false;
        Set<Integer> set = new HashSet<>();
        

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                visited = true;
            }
            else {
                set.add(nums[i]);
            }
        }        
        return visited;
    }
}