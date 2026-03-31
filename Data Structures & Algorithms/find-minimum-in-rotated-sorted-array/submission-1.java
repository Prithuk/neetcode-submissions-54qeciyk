class Solution {
    public int findMin(int[] nums) {

        int left = 0;
    int right = nums.length - 1;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        
        if (nums[mid] > nums[right]) {
            // We're in the left (bigger) part, min is to the right
            left = mid + 1;
        } else {
            // We're in the right (smaller) part, min is here or left
            right = mid;
        }
    }
    
    return nums[right];
        
    }

  
}
