class Feb_6 {
    public int[] shortestToChar(String s, char c) {
        int[] answers = new int[s.length()];

        for(int a = 0; a < s.length(); a++) {
        	answers[a] = Integer.MAX_VALUE;
        }


        LinkedList<Integer> q = new LinkedList();
        int i = 0;
        while (s.indexOf(c, i) != -1) {
        	int index = s.indexOf(c,i);
        	q.add(index);
        	i = index + 1;
        }

        for (int j = 0; j < s.length(); j++ ) {
        	for(Integer k : q) {
        		if ( k + j < answers.length && answers[k + j] > j) {
        			answers[k + j] = j;
        		} if (k - j >= 0 && answers[k - j] > j) {
        			answers[k - j] = j;
        		}
        		
        		
        	}
        }
        return answers;
    }

   
}