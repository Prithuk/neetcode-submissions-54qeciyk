class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        for(int i=0; i<numbers.length; i++){
            int sum=0; 

            for(int j=1; j<numbers.length; j++){
                if(i<j){
                     sum = numbers[i] + numbers[j];
                }

                if(sum==target){
                    return new int [] {i+1, j+1}; 
                }
            }
        }
return new int[]{}; 
    }
}
