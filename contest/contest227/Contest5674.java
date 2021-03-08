class Contest5674 {
       public String largestMerge(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int c1 = 0;
        int c2 = 0;
        while ( c1 < w1.length && c2 < w2.length ) {

        	if (w1[c1] - w2[c2] == 0) {
        		// need to chose to take from w1 or w2.
        		int select = select(Arrays.copyOfRange(w1, c1 + 1, w1.length ), 
        			Arrays.copyOfRange(w2, c2 + 1, w2.length ));
        		if (select == 0) {
        			builder.append(w1[c1]);
            		c1 ++;
        		} else {
        			builder.append(w2[c2]);
            		c2 ++;
        		}
            }
            else if (w1[c1] - w2[c2] > 0) {
            	builder.append(w1[c1]);
            	c1 ++;
            } else {
            	builder.append(w2[c2]);
            	c2 ++;
            }
        }

        if (c1 < w1.length) {
        	builder.append(Arrays.copyOfRange(w1, c1, w1.length ));
        } else if (c2 < w2.length){
        	builder.append(Arrays.copyOfRange(w2, c2, w2.length ));
        }
        return builder.toString();
    }

    private int select(char[] one, char[] two) {
    	int compare = 0, select = 0, i = 0, j = 0;
    	while (true) {
    		// if all the same and one is larger than other select the bigger array.
    		if  (i >=  one.length ) {
    			compare = 1;
    			break;
    		} 
			else if (j >= two.length) {
				compare = 0;
				break;
			}


			if (one[i] - two[j] > 0 ) {
				compare = 0;
				break;
			} else if (one[i] - two[j] < 0) {
				compare = 1;
				break;
			}
    		i ++;
    		j ++;
    	}
    	return compare;
    }


}