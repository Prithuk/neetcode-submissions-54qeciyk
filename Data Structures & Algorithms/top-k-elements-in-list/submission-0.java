class Solution {

    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> data = new HashMap<>();
       for(int x: nums){
        data.put(x, 1+data.getOrDefault(x, 0)); 
       } 

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(data.entrySet()); 
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder())); 

        int [] res = new int[k]; 
        for(int i=0; i<k; i++){
            res[i]= list.get(i).getKey(); 
        }

        return res; 

    }
}
