class Solution {
    public List<List<String>> solveNQueens(int n) {
         char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]= '.';
            }
        }
         List<List<String>> ans = new ArrayList<>(); 
      nqueen(board, 0, ans); //0 is row number
       return ans; 
    }


    private static void nqueen(char[][] board, int row, List<List<String>> ans ) {
        int n  = board.length;
       
        //base case
        if(row==n){
             List<String> r = new ArrayList<>();
                // convert 2D char array into list of string
              for(int i=0; i<n; i++){
                String str = ""; 
                for(int j=0; j<n;j++){
                        str +=board[i][j];
                }
                r.add(str);
              }  
        ans.add(r); 
        return;
        }

        for(int j=0; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                nqueen(board, row+1, ans);
                board[row][j]='.'; // backtracking.
            }
        }
    }




    private static boolean isSafe(char[][] board, int row, int cols) {
     //check row
        int n = board.length;
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q') return false;
        }

        //check cols
        for(int i=0; i<n; i++){
            if(board[i][cols]=='Q') return false;
        }

        //check diagonal

        //check north east
        int i = row;
        int j = cols;

        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //check south east
         i = row;
         j = cols;

        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }


        //check south west
        i = row;
        j = cols;

        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        //check north west
        i = row;
        j = cols;

        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
    return true;
    }
}
