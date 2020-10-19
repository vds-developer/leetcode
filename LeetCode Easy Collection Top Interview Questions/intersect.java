

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        LinkedList<Integer> sol = new LinkedList<>();
        HashMap<Integer, Integer> htable = new HashMap<>();
        for ( int i = 0; i < n; ++i ) {
            htable.put(nums1[i], htable.getOrDefault(nums1[i], 0) + 1);
        }
        for ( int j = 0; j < m; ++j ) {
            if (htable.getOrDefault(nums2[j], 0) > 0 ) {
                  sol.add(nums2[j]);
                htable.put(nums2[j], htable.get(nums2[j]) - 1 );
            }
        }
        
        return sol.stream().mapToInt(i -> i).toArray();
    }
}