class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if ( n != m ) {
            return false;
        }
        int [] count = new int[26];
        for(int i = 0; i < n ; ++i ){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for ( int c : count ) {
            if (c != 0 ) return false;
        }
        return true;
    }
}