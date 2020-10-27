class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; ++i ) {
            for (int j =0; j < 9; ++j ) {
                if( board[i][j] != '.' && !isValidSpot(i, j, board)) return false;
            }
        }
        return true;
        
    }
    
    private boolean isValidSpot(int i, int j, char[][] board ) {
        char letter = board[i][j];
        return checkRow(i,j, letter, board) && checkCol(i,j,letter, board) && checkSubBox(i,j,letter, board);
    }
    
    private boolean checkRow(int i, int j, char value, char[][] board) {
        for ( int col = 0; col < 9; ++col ) {
            if (col != j && board[i][col] == value  ) {
               return false;
            }
        }
        return true;
    }
    
    private boolean checkCol(int i, int j, char value, char[][] board) {
         for ( int row = 0; row < 9; ++row ) {
            if (row != i && board[row][j] == value ) {
               return false;
            }
        }
        return true;
    }
    
    private boolean checkSubBox(int i, int j, char value, char[][] board) {
        int n = i / 3 * 3 + 3;
        int m = j / 3 * 3 + 3;
        System.out.println(n + ", " +  m);
        for ( int row = i / 3 * 3; row <  n; ++row ){
            for (int col = j / 3 * 3; col < m; ++col ) {
                  if ( board[row][col] == value && row != i && col != j ) {
                    return false;
                 }
            }
        }
        return true;
    }
}