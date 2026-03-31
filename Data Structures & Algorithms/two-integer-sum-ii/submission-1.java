class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> data = new HashMap<>(); 

        for(int i=0; i<numbers.length; i++){
            int complement = target-numbers[i]; 
            if(!data.containsKey(complement)){
                data.put(numbers[i], i); 
            } else{
                return new int[]{data.get(complement)+1, i+1}; 
            }


        }
    return new int[]{}; 
       
    }
}
