class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultset = new ArrayList<>();
        helper(resultset, new ArrayList<>(), nums, 0);
        return resultset;
    }

    private static void helper(
        List<List<Integer>> resultset, List<Integer> tempset, int[] nums, int start) {
        resultset.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);
            helper(resultset, tempset, nums, i + 1);
            tempset.remove(tempset.size() - 1);
        }
    }
}
