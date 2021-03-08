import java.util.*;
public class Contest5678 {
	public int minimumSize(int[] nums, int maxOperations) {
    	Arrays.sort(nums);
        int right = nums[nums.length - 1];
        int left = 0;
        int middle = (right - left) / 2 + left;

        while (left <= right) {
            middle = (right - left) / 2 + left;
            int nm = canDo(nums, middle, maxOperations);
            else if (nm <= maxOperations) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        if (nm <= maxOperations) {
            return middle;
        } else if (nm > maxOperations){
            return middle + 1;
        } else {
            return middle - 1;
        }
        
    }
    private int canDo(int[] nums, int ideal, int maxOperations) {
    		int numberOperations = 0;
    		for(int i : nums) {
    			if (i > ideal) {
    				numberOperations += (int) Math.ceil(((double) i / (double) ideal)) - 1;
    			}
    		}
    		return numberOperations;
    }
}