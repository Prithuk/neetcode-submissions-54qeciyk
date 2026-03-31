class Solution {
    public int characterReplacement(String s, int k) {
       int left =0; 
        int maxLength=0; 
        int n = s.length(); 
        int [] freq = new int[26]; 
        int maxFreq=0; 

        for(int right=0; right<n; right++){
        freq[s.charAt(right)-'A']++; 
         maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']); 
        int currentWindowlength =right-left+1; 
         int changesNeeded = currentWindowlength- maxFreq; 
         if (changesNeeded>k){
            char leftchar = s.charAt(left);
             freq[leftchar -'A']--; 
            left++; 
         }
        maxLength = Math.max(maxLength, right-left+ 1); 
        }
        return maxLength; 
    }
}
