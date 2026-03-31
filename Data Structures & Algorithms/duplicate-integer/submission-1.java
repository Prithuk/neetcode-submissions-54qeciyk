class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> data = new HashMap<>(); 
        int count =0; 

        for(int x: nums){
            data.put(x, 1+ data.getOrDefault(x,0));
        }

        for(Map.Entry<Integer, Integer> res: data.entrySet()){
            int key= res.getKey(); 
            int value = res.getValue(); 

            if(value>1){
                res.getKey(); 
                return true; 
            }
        }
return false; 
    }
}