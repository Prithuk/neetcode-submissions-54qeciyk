class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String, List<String>> data = new HashMap<>(); 
     List<String> result = new ArrayList<>(); 
     for(int i=0; i<strs.length; i++){
        char [] ch = strs[i].toCharArray(); 
        Arrays.sort(ch); 
        String signature = new String(ch); 
        data.putIfAbsent(signature, new ArrayList()); 
        data.get(signature).add(strs[i]);
     }
  return new ArrayList<>(data.values());
    }
}
