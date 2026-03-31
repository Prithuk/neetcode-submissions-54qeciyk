class Solution {

    public String encode(List<String> strs) {
            /*
            concatenate length and pound
            make single string return it
            */

            StringBuilder sb = new StringBuilder(); 
            for(int i=0; i<strs.size(); i++){
                sb.append(strs.get(i).length() + "#" +strs.get(i));
            }
            return sb.toString(); 

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>(); 
       int i=0; 
       while(i<str.length()){
        int j=i; 
        while(str.charAt(j)!='#') j++; 
        int len = Integer.parseInt(str.substring(i, j)); 
        i= j+1;
        result.add(str.substring(i, i+len));  
        i= i+len;
       }
     return result; 
    }
}
