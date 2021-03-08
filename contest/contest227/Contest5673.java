class Contest5673 {
    public int maximumScore(int a, int b, int c) {
        int score = 0;
        while (anytwo(a,b) || anytwo(b,c) || anytwo(a,c)) {
        	if ( a >= c && b >= c && anytwo(a,b)) {
        		a --;
        		b --;
        	} else if (b >= a && c >= a && anytwo(b,c)) {
        		c --;
        		b --;
        	} else if (a >= b && c >= b && anytwo(a,c)) {
        		a--;
        		c--;
        	}
        	score ++;
        }
        return score;

    }

    private boolean anytwo(int s1, int s2) {
    	return s1 > 0 && s2 > 0;
    }

}