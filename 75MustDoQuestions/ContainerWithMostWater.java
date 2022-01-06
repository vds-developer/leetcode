class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int lIndex = 0;
        int rIndex = height.length - 1;
        while (lIndex < rIndex ) {
            int localMax = Math.min(height[lIndex], height[rIndex]) * (rIndex - lIndex);
            if (localMax > max) max = localMax;
            if (height[lIndex] < height[rIndex]) {
                lIndex ++;
            } else {
                rIndex --;
            }
        }
        return max;
    }
}