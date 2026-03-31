class Solution {
    public boolean isAnagram(String s, String t) {

       // Brute Force Approach I am thinking
       // to charArray
       //sort the array
       // another string
    // compare , if they are equal 

    char [] s1 = s.toCharArray(); 
    Arrays.sort(s1); 
    String sortedS = new String(s1); 


     char [] t1 = t.toCharArray(); 
    Arrays.sort(t1); 
    String sortedT = new String(t1); 


    if(sortedS.equals(sortedT)){
        return true; 
    }
return false; 

    }
}
