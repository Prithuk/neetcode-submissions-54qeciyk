class Solution {
    public int paths(int row, int cols, int m, int n, int[][] memo) {
        if (row >= m || cols >= n) return 0;
        if (row == m - 1 && cols == n - 1) return 1;
        
        if (memo[row][cols] != 0) {
            return memo[row][cols];
        }

        int rightways = paths(row, cols + 1, m, n, memo);
        int downways = paths(row + 1, cols, m, n, memo);

        memo[row][cols] = rightways + downways;
        return memo[row][cols];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return paths(0, 0, m, n, memo);
    }
}