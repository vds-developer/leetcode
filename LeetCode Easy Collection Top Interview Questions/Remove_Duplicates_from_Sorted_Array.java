class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0 ) return 0;
        int currentIndex = 1;
        int prevValue = nums[0];
        for (int i = 1; i<nums.length; ++i) {
            if (prevValue < nums[i]) {
                prevValue = nums[i];
                nums[currentIndex] = nums[i];
                currentIndex ++;
            } 
        }
        return currentIndex;
    }
}