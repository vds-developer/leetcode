class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();
        for ( int i = 0; i < nums.length ; ++i ) {
            if (! hashSet.add(nums[i])) {
                return true;
        }
    }
                return false;
}
}