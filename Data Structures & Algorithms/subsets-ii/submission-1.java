class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // 1. Sort the array to easily handle duplicates
        Arrays.sort(nums); 
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int[] nums, int start, List<Integer> ds, List<List<Integer>> ans) {
        // Unconditionally add the current subset
        if(ans.contains(ds)) return; 
        ans.add(new ArrayList<>(ds));

        // 2. Start from the 'start' index, not 0
        for (int i = start; i < nums.length; i++) {
            // 3. Skip duplicates
            // if (i > start && nums[i] == nums[i - 1]) {
            //     continue; 
            // }
            
            ds.add(nums[i]);
            // Move to the next index
            helper(nums, i + 1, ds, ans); 
            // Backtrack
            ds.remove(ds.size() - 1); 
        }
    }
}