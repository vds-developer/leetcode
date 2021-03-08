class Contest1755 {
    public int minAbsDifference(int[] nums, int goal) {
    	//knapsack variannt
    	return knapsack(nums.length - 1, goal, 0, nums);
        


    }


    public int knapsack(int n, int goal, int sum, int[] nums) {
    	if (n < 0 || Math.abs(sum - goal) == 0) return 0;
    	int tmp = knapsack(n-1, goal, sum, nums);
    	int tmp2 = nums[n] + knapsack(n-1, goal, sum, nums );
    	int result = 0 ;
    	if (Math.abs(tmp - goal) < Math.abs(tmp2 - goal)) {
    		result = tmp;
    	} else {
    		result = tmp2;
    	}
    	System.out.print(result + " ");
    	// System.out.print(tmp2);
    	System.out.println();
    	return result;
    }


    public static void main(String[] args) {
    	Contest1755 c = new Contest1755();
    	int[] nums = new int[] {7,-9,15,-2};
    	int r = c.minAbsDifference(nums, -5);
    	System.out.println(r);
    }
}