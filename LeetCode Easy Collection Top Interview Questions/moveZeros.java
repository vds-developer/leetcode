class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int currentZero = Integer.MAX_VALUE;
        int nextNonZero = Integer.MIN_VALUE;
         for (int j = 0; j < n; ++j ) {
                    if (nums[j] == 0 ) {
                        currentZero = j;
                        break;
                }
         }
        for ( int i = 0; i< n ; ++i) {
            if (nums[i] != 0 ) {
                nextNonZero = i;
            }
            if ( currentZero < nextNonZero ) {
                int tmp = nums[currentZero];
                nums[currentZero] = nums[nextNonZero];
                nums[nextNonZero] = tmp;
                for (int j = currentZero; j < n; ++j ) {
                    if (nums[j] == 0 ) {
                        currentZero = j;
                        break;
                }
            }
        }
    
    }
    }
}