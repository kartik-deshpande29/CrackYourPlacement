class Solution {
    public int removeDuplicates(int[] arr) {
        // HashSet<Integer> set = new HashSet<>();
        // int count = 0;
        // for (int ele : nums) {
        //     set.add(ele);
        // }
        
        if (arr.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}