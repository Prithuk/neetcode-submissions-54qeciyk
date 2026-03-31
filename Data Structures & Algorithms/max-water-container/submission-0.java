class Solution {
    public int maxArea(int[] heights) {
        //
        int area = Integer.MIN_VALUE; 
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                int height =0; 
                if(heights[i]<heights[j]){
                  height=heights[i]; 
                }else{
                     height=heights[j]; 
                }
                int width = j-i; 
                area = Math.max(height*width, area); 
            }
        }
return area;
    }
}
