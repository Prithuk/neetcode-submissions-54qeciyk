class Solution {
    public int maxProfit(int[] prices) {
        
            int maxProfit =0; 

            for(int i=0; i<prices.length; i++){
                int buyingPrice = prices[i]; 

                for(int j=i+1; j<prices.length; j++){
                    int maxElement =0; 
                    maxElement = Math.max(maxElement, prices[j]); 
                   int profit = maxElement - prices[i]; 
                   maxProfit = Math.max(maxProfit, profit); 
                }
            }
        return maxProfit; 
    }
}
