public class Contest5677 {
	public int countHomogenous(String s) {
        double count = 0;
        int internalCount = 0;
        char[] charArray = s.toCharArray();
        Character lookupCharacter = null;
        int n = charArray.length;

        for (int i = 0; i < n; i++ ) {
        	if (lookupCharacter == null || lookupCharacter != charArray[i]) {
        		for ( int j = 1; j <= internalCount; j ++ ) {
        			count += internalCount - j + 1;
        		} 
        		lookupCharacter = charArray[i];
        		internalCount = 1;
        	} else {
        		internalCount++;
        	}
        }


        return (int) ( count % ( Math.pow(10, 9) + 7.0));

    }
}