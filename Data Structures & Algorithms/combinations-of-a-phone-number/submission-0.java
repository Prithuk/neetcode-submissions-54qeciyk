class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {return ans;}
       Map<Character, String> map = Map.of(
            '2', "abc", '3', "def", '4', "ghi",
            '5', "jkl", '6', "mno", '7', "pqrs",
            '8', "tuv", '9', "wxyz"
        );

        helper(ans, digits, 0, map, new StringBuilder());
        return ans; 
    }

    private static void helper(List<String> ans, String digits, int index,
    Map<Character, String> map, StringBuilder temp ) {

        if(index == digits.length()){
            ans.add(temp.toString()); 
            return; 
        }

    String letters = map.get(digits.charAt(index)); 

    for(char c : letters.toCharArray()){
        temp.append(c); 
        helper(ans, digits, index+1, map, temp); 
        temp.deleteCharAt(temp.length()-1); 
    }


    }
}
