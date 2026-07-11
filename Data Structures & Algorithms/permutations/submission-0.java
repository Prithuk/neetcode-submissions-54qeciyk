class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>(); 
    boolean [] flag = new boolean[nums.length]; 
    
    helper( nums, ans, new ArrayList<>(), flag); 
    return ans; 

    }


    private static void helper( int [] nums, List<List<Integer>> ans, 
    List<Integer>ds,  boolean[] flag){

        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds)); 
            return; 
        }


    for(int i=0; i<nums.length; i++){
         if(flag[i]==false){
        ds.add(nums[i]); 
         flag[i]= true; 
         helper( nums, ans, ds, flag); 
          ds.remove(ds.size()-1); 
        flag[i]= false; 
         }
        
        }
    }
}
