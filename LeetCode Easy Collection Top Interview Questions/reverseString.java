class Solution {
    public void reverseString(char[] s) {
        int half = s.length / 2;
        int n = s.length;
        for ( int i = 0; i < half; ++i ) {
            char temp = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = temp;
        }
    }
}