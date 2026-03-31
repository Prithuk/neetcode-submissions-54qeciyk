class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();

        for(int i=0; i<nums.length; i++){

            if(!data.contains(nums[i])){
                data.add(nums[i]); 
            }else{
                return nums[i]; 
            }
        }
       return -1; 
    }
}
