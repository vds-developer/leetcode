package contest.contest226;

import java.util.*;


class Contest5654 {
    public int countBalls(int lowLimit, int highLimit) {
         HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = highLimit - lowLimit + 1;
        for ( int i = lowLimit; i < highLimit + 1; i ++ ) {
        	int tmp = i;
        	LinkedList<Integer> ll = new LinkedList();
        	while(tmp != 0 ) {
        		int re = tmp % 10;
        		tmp /= 10;
                ll.add(re);
        	}
        	int sum = 0;
        	for (int li : ll) {
        		sum += li;
        	}
        	// System.out.println(sum);
        	hmap.put(sum, hmap.getOrDefault(sum, 0) + 1);
        }
        int max = 0;
        Integer  k = null;
      	for (Integer key : hmap.keySet()) {
      		// System.out.println(key);
      		if (hmap.get(key) > max ) {
                max = hmap.get(key);
                k = key;
            }
      	}

      	return max;
    }

    public static void main(String[] args) {
    	Contest5654 s = new Contest5654();
    	int result = s.countBalls(1,10);
    	System.out.println(result);
    }
}