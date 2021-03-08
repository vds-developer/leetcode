public class Contest5676 {
	public int minOperations(String s) {
		int min1 = 0; // start with 0;
		int min2 = 0; // start with 1;
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        for (int i = 0 ; i < n ; i ++ ) {
        	if (i % 2 == 0) {
        		if (charArray[i] == '0') {
        			min2 ++;
        		} else {
        			min1 ++;
        		}
        	} else { 
        		if (charArray[i] == '0') {
        			min1 ++;
        		} else {
        			min2 ++;
        		}
        	}
        }
        return Math.min(min1, min2);
    }


}