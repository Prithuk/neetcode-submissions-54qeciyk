class Solution {
    public boolean hasDuplicate(int[] nums) {
       

       Set<Integer> data = new HashSet<>(); 

        for(int x : nums){
            if(data.contains(x)){
                return true; 
            }
            data.add(x); 
        }
        return false; 
    }
}