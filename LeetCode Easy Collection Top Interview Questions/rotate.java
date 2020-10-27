class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int cycles = n / 2;
        
        for (int i = 0; i < cycles; ++i ) {
            for ( int j = i; j < n - i - 1; ++j ) {
                
                // i indent number
                // j current index
                // n - i - 1 top and left
                // n - j - 1 bot and right
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
}