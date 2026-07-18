class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] isVisited = new boolean[rows][cols];
        
        // Loop through every cell to find a starting point matching word.charAt(0)
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // Kick off DFS from this cell
                if (dfs(board, word, r, c, 0, isVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int index, boolean[][] isVisited) {
        // 1. Success Base Case: Entire word matched
        if (index == word.length()) return true;

        // 2. Boundary Check
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;

        // 3. Re-visit and Character Match Validation
        if (isVisited[r][c] || board[r][c] != word.charAt(index)) return false;

        // Mark visited
        isVisited[r][c] = true;

        // 4. Explore all 4 directions with early exit optimization
        boolean found = dfs(board, word, r, c + 1, index + 1, isVisited) || // Right
                        dfs(board, word, r + 1, c, index + 1, isVisited) || // Down
                        dfs(board, word, r, c - 1, index + 1, isVisited) || // Left
                        dfs(board, word, r - 1, c, index + 1, isVisited);   // Up

        // Backtrack
        isVisited[r][c] = false;

        return found;
    }
}