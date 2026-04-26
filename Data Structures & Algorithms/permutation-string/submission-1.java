class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
       /*
R
l e c a b ee
L



       */

       int [] s1Freq= new int [26]; 
       int [] windowFreq= new int[26];

       for(int i=0; i<s1.length(); i++){
        char ch = s1.charAt(i); 
        s1Freq[ch-'a']++; 
       } 

    //    int left =0; 

       for(int right=0; right<s2.length(); right++){
        char rchar = s2.charAt(right); 
        windowFreq[rchar-'a']++; 

        if(right>=s1.length()){
            char lchar = s2.charAt(right-s1.length()); 
            windowFreq[lchar-'a']--; 
        }

         if( Arrays.equals(s1Freq, windowFreq)) {
                return true; 
    }

       }

         return false; 
           
    }
}
