class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> data = new HashMap<>();
       for(int x: nums){
        data.put(x, 1+data.getOrDefault(x, 0)); 
       } 
       PriorityQueue<Map.Entry<Integer, Integer>> queue = new
       PriorityQueue<>((a, b) -> a.getValue()-b.getValue()); 
       System.out.println(queue);

        for(Map.Entry<Integer, Integer>res: data.entrySet()){
            queue.offer(res);
            if(queue.size()>k){
                queue.poll(); 
            } 
        }
        System.out.println(queue);
        int [] result = new int[k]; 

        for(int i=0; i<k; i++){
          Map.Entry<Integer, Integer> before =  queue.poll(); 
          System.out.println("Before:" + before);
            result[i]= before.getKey(); 
        }
        return result; 
    }
}
