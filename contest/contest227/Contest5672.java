
class Contest5672 {
    public boolean check(int[] nums) {
        int indexPosition = 0;
        int lowestInt = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i ++ ) {
        	if (lowestInt > nums[i]) {
        		lowestInt = nums[i];
        		indexPosition = i;
        	}
        }

        int rotate = n - indexPosition % n;
      	boolean isSortedO = false;

        for (int i = 0 ; i < n; i ++ ) {
        	rotateArray(nums);
        	boolean isSorted = true;
	        for (int j = 0 ; j < n-1; j ++ ) {
	        	if (nums[j] > nums[j + 1]) isSorted = false;
	        }
	        if (isSorted) {

	        	isSortedO = true;
	        		        	break;
	        }
        }
        // rotate

        // for (int i = 0; i < n; i ++ ) {
        // System.out.println(nums[i]);
        // }

       
        // for (int i = 0 ; i < n-1; i ++ ) {
        // 	if (nums[i] > nums[i + 1]) isSorted = false;
        // }

    	return isSortedO;

    }

    private void rotateArray(int[] nums) {
    	int last = nums[nums.length - 1];
    	for (int i = nums.length - 1; i > 0 ; i-- ) {
    		nums[i] = nums[i - 1];
    	}
    	nums[0] = last;
    }

    public static void main(String[] args) {
    	int[] input = new int[] {2,1,3, 4};
    	Contest5672 s = new Contest5672();
    	System.out.println(s.check(input));
    }
}