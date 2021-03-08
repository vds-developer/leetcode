class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0 ) return 0;
        for (int i = 0 ; i < n - m + 1 ; ++i ) {
            boolean isMatch = false;
            for ( int j = 0; j < m  ; ++j ) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    isMatch = false;
                    break;
                } else { 
                    isMatch = true;
                }
            }
             if (isMatch) return i;
        }
        return -1;
    }
}