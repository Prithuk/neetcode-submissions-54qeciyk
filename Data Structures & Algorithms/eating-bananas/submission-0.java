class Solution {
   public int minEatingSpeed(int[] piles, int h) {
    // Step 1: Find the biggest pile (maximum possible speed needed)
    int maxPile = 0;
    for (int pile : piles) {
        if (pile > maxPile) {
            maxPile = pile;
        }
    }
    
    // Step 2: Binary search between 1 and maxPile
    int left = 1;
    int right = maxPile;
    
    while (left < right) {
        int mid = left + (right - left) / 2;
        
        if (canFinish(piles, h, mid)) {
            right = mid;  // Try slower speed
        } else {
            left = mid + 1;  // Need faster speed
        }
    }
    
    return left;
}

// Simple helper function - easy to trace
boolean canFinish(int[] piles, int h, int speed) {
    int hoursNeeded = 0;
    
    for (int i = 0; i < piles.length; i++) {
        int pile = piles[i];
        
        // Calculate hours for this pile (simple division + remainder check)
        int hours = pile / speed;
        if (pile % speed != 0) {
            hours++; // Add 1 more hour if there's leftover
        }
        
        hoursNeeded = hoursNeeded + hours;
        
        // Early exit - if already over hours, stop
        if (hoursNeeded > h) {
            return false;
        }
    }
    
    return true;
}

}
