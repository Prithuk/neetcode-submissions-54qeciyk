class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer, Integer> data = new HashMap<>();    

     for(int x:nums){
      data.put(x, data.getOrDefault(x, 0)+1); 
     }

//heap data structure to keep top k frquent elemets
PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue()); 


for(Map.Entry<Integer, Integer> map: data.entrySet()){
  heap.offer(map); 
  if(heap.size()>k){
    heap.poll(); 
  }
}


int [] result = new int[k]; 
for(int i=k-1; i>=0; i--){
  result[i] = heap.poll().getKey(); 
}
return result; 
    }
}
