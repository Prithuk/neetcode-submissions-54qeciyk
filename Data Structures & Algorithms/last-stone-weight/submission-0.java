class Solution {
    public int lastStoneWeight(int[] stones) {
        

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a); 

        for(int x: stones){
            queue.offer(x); 
        }

        while(queue.size()>1){
            int firstBig = queue.poll(); 
             int secondBig = queue.poll(); 
             if(firstBig!=secondBig){
                queue.offer(firstBig-secondBig); 
             }
        }
        return queue.isEmpty()?0:queue.peek(); 
    }
}
