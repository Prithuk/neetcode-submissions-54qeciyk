class Solution {
    public int findKthLargest(int[] nums, int k) {
        

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> a-b); 

        for(int x: nums){
            queue.add(x); 

            if(queue.size()>k){
                queue.poll(); 
            }
        }

       return queue.peek(); 
    }
}
