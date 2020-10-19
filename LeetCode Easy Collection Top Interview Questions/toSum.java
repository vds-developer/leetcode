class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = nums.length;
        int[] sol = new int[2];
        for(int i = 0; i < n; ++i ) {
            int complement = target - nums[i];
            if ( hmap.containsKey(complement) ) {
                return new int[] {i, hmap.get(complement)};
            }
            hmap.put(nums[i], i);
        }
        return new int[] {}; 
    }
}