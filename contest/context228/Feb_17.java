public class Feb_17 {
	public int maxArea(int[] height) {
        int maxVolume = 0;
        int n = height.length;
        for (int i = 0; i < n; ++i) {
        	for (int j = i; j < n; ++j ) {
        		int h = Math.min(height[i], height[j]);
        		int w = j - i;
        		if (maxVolume < h * w) {
        			maxVolume = h * w;
        		}
        	}
        }
        return maxVolume;
    }
}