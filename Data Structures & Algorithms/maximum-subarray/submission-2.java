class Solution {
    public int maxSubArray(int[] nums) {
        
        // 2 -3 4 -2 2 1 -1 4

        if(nums.length==1){
            return nums[0]; 
        }

        int maxSum = Integer.MIN_VALUE; 
        for(int i=0; i<nums.length; i++){
                int currentSum = 0;
                for(int j=i; j<nums.length; j++){
                   currentSum = currentSum+ nums[j]; 
                    if(currentSum> maxSum){
                        maxSum = currentSum; 
                    }
                }
        }
return maxSum; 
    }
}
