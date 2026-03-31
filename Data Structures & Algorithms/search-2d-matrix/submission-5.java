class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;         // Number of rows
    int cols = matrix[0].length;
 
        for(int i=0; i<rows; i++){
            if(matrix[i][0]<=target && target<=matrix[i][cols-1]){
                return binarySearch(matrix[i], target); 
            }
        }
        return false; 
    }

    private boolean binarySearch(int [] matrix, int target){
        int low = 0; 
        int n = matrix.length; 
        int high = n-1; 
        while(low<=high){
            int mid = (low+high)/2; 
                if(target==matrix[mid]){
                    return true; 
                }
            else if(target<matrix[mid]){
                high = mid-1; 
            }else{
                low = mid+1; 
            }
        }
        return false; 
    }
}
