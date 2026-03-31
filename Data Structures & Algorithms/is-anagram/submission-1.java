class Solution {
    public boolean isAnagram(String s, String t) {

       // next time solve using hashmap and array both. 

       if(s.length()!=t.length()) return false; 

            char ch []= s.toCharArray(); 
            Arrays.sort(ch); 
            String s1 = new String(ch); 

                 char ch1 []= t.toCharArray(); 
            Arrays.sort(ch1); 
            String s2 = new String(ch1); 

            if(s1.equals(s2)) return true; 
            return false; 
    

    }
}
