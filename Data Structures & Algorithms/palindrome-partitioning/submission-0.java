class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(ans, s, 0, new ArrayList<>());
        return ans;
    }

    private void helper(List<List<String>> ans, String s, int start, List<String> ds) {
        // Base Case: If start reaches the end of the string, we found a valid partition!
        if (start == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            // Slice the substring from 'start' to 'i'
            String sub = s.substring(start, i + 1);
            
            if (isPalindrome(sub)) {
                ds.add(sub); // Choose
                helper(ans, s, i + 1, ds); // Explore the remaining string
                ds.remove(ds.size() - 1); // Backtrack (Un-choose)
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}