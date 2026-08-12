class Solution {
    public int[] twoSum(int[] nums, int target) {
      /*

      3 - 0
  
    int result = 7-3 = 4

    if(map.containsKey(result))
     
      */

      Map<Integer, Integer> data = new HashMap<>(); 
      for(int i=0; i<nums.length; i++){
          int difference = target - nums[i];

          if(!data.containsKey(difference)){
            data.put(nums[i], i); 
          }else{
            return new int[]{data.get(difference), i}; 
          }
      }
return new int[]{}; 
    }
}
