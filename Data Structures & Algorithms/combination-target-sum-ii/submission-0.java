

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        // 1. Must sort to place duplicates next to each other
        Arrays.sort(candidates); 
        
        helper(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void helper(int index, int[] nums, int target, List<Integer> ds, List<List<Integer>>ans) {
        // Base case: successfully hit the target
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Loop through the remaining candidates
        for (int i = index; i < nums.length; i++) {
            // If the element exceeds the target, no point in looking further (since it's sorted)
            if (nums[i] > target) {
                break;
            }

            // 2. Skip duplicate elements at the same recursion level
            if (i > index && nums[i] == nums[i - 1]) {
                continue; // ✅ Valid here because it is inside a 'for' loop!
            }

            // Include the element
            ds.add(nums[i]);
            
            // Move to i + 1 because each element can only be used ONCE
            helper(i + 1, nums, target - nums[i], ds, ans);
            
            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }
}