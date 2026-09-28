class Solution {

 public static int helper(int[] nums, int start, int end) {
        int [] dp = new int[nums.length]; 
        dp[start] = nums[start]; 
        dp[start+1] = Math.max(nums[start], nums[start+1]); 
        
        for(int i=start; i<=end; i++){
         if(i>1) dp[i] = Math.max(dp[i-2]+ nums[i], dp[i-1]); 
        
        }
    return dp[end]; 
    }

    public int rob(int[] nums) {
        int n = nums.length; 
        if(n==1) return nums[0]; 
        if(n==2) return Math.max(nums[0], nums[1]); 
        int start = helper(nums, 0,n-2); 
        int end = helper(nums, 1,n-1); 
        return Math.max(start, end);
}
}