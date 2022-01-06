class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> reverseMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(reverseMap.get(target - nums[i]) != null) {
                return new int[] {i, reverseMap.get(target - nums[i])};
            }
            reverseMap.put(nums[i], i);
        }

        return null;
    }
}