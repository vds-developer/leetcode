
	class Feb_18 {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n - 2; ++i) {
            boolean same = true;
            int iterator = i;
            while (same && iterator + 2 < n) {
                same = A[iterator] - A[iterator+1] == A[iterator+1] -A[iterator+2];
                if (same) {
                    count ++;
                }
                iterator ++;
      
            }
        }
        return count;
    }
}
