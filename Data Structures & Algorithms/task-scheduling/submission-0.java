class Solution {
    public int leastInterval(char[] tasks, int n) {
       // calculating the max freq 
        /*
        -> x-2, y-2, n=2
        -> (n-1) f-1 
        xy_xy
        xy_ = 1 unit
        xy = 1 unit
        f=2
        total gap = f-1 =2-1
        totalEl in each block = n+1
        */

        int [] freq  = new int[26]; 
        int maxFreq = 0; 

        for(int i=0; i<tasks.length; i++){
            char ch = tasks[i]; 
            freq[ch-'A'] ++ ; 
        }

        for(int i=0; i<freq.length; i++){
            maxFreq = Math.max(maxFreq, freq[i]); 
        }  
int maxCount =0; 
        //need to count , how many chcar have maxCOunt x=2, y=2
        /*
            x=2, y=2
            x.freq=2 ++
        */

       for(int i:freq){
        if(i==maxFreq) maxCount++; 
       }

        int totalGap = maxFreq-1; 
       int totalBlockElement = n+1; 
       int totalElements = totalGap*totalBlockElement; 
       int available =totalElements+maxCount; 
       return Math.max(available, tasks.length); 

    }
}
