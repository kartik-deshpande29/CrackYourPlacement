class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int ele : nums) {
            if (set.contains(ele)) {
                list.add(ele);
            }
            set.add(ele);
        }
        return list;
    }
}