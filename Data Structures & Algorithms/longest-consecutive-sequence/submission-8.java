class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0) return 0;
    Arrays.sort(nums);     
    int lastSmaller = nums[0]; 
    int count =1; 
    int longest=1;

    for(int i=1; i<nums.length; i++){
        if(nums[i]==nums[i-1]) continue; 
        if(nums[i]-1 ==lastSmaller){
            lastSmaller=nums[i]; 
            count++; 
        }else{
            count=1; 
            lastSmaller= nums[i];   
        }
        longest= Math.max(count, longest);
    }
     return longest; 
    }
}
