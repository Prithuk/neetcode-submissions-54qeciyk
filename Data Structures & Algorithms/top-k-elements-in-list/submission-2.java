class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer, Integer> map = new HashMap<>(); 

     for(int x: nums){
       map.put(x, 1+ map.getOrDefault(x, 0)); 
     }

     // sort the values in descending order
     List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); 
    list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

    int [] result = new int[k]; 

    for(int i=0; i<k;i++){
        result[i]= list.get(i).getKey(); 
    } 


    return result; 




    }
}
