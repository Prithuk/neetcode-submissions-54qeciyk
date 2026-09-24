class Solution {
    int[] result; 
    private int helper(int n ) { 
        if(n==0 || n==1) return 1; 
        if (result[n - 1] != -1) {
            return result[n - 1];
        }
        int sum = helper(n - 1) + helper(n - 2);
         result[n - 1] = sum; 
         return sum; 
    }

    public int climbStairs(int n) {
       result = new int[n];
         for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int finalResult =   helper(n); 
        return finalResult; 
    }
}
