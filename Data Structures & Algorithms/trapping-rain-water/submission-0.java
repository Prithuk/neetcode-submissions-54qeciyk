class Solution {
    public int trap(int[] height) {
        

//Brute force approach for this

    int n = height.length; 
    int sum =0; 

    for(int i=1; i<=n-2; i++){

        //find lmax

        //find rmax

        //min(lmax, rmax)-height[i]

        int lmax = Solution.lmax(height, i);
        int rmax = Solution.rmax(height, i);

        sum+=Math.min(lmax, rmax)-height[i]; 
    }
    return sum;  
 }

     private static int lmax(int [] height, int currentElement){

        int lmax=0;     
       for (int i=currentElement; i>=0; i--){
            lmax=Math.max(lmax, height[i]); 
        }
        return lmax; 
    }

     private static int rmax(int [] height, int currentElement){

        int rmax=0;     
        for( int i=currentElement; i<height.length; i++){
            rmax=Math.max(rmax, height[i]); 
        }
        return rmax; 
    }
}
