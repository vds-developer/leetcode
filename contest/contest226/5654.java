import java.util.*;


class 5654 {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = highLimit - lowLimit + 1;
        for ( int i = lowLimit; i < highLimit + 1; i ++ ) {
        	int tmp = i;
        	LinkedList<Integer> ll = new LinkedList();
        	while(tmp != 0 ) {
        		int re = tmp % 10;
        		tmp /= 10;
        	}
        	int sum = 0;
        	for (int li : ll) {
        		sum += li;
        	}
        	hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        int max = 0;
      	for (Integer key : hmap.keySet()) {
      		if (hmap.get(key) > max ) max = hmap.get(key);
      	}

      	return max;
    }

    public static void main(String[] args) {
    	Solution s = new Solution();
    	int result = s.countBalls(4,2);
    	System.out.println(result);
    }
}