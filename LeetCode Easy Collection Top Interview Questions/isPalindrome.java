class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();
        int r = 0;
        int l = n - 1;
        for ( int i = 0; i < n  ; i++ ) {
            char right = s.charAt(r);
            char left = s.charAt(l);
            if ( Character.isLetterOrDigit(right) &&
            Character.isLetterOrDigit(left)) {
                r++;
                l--;
                System.out.println(r + " " + l);
                if ( Character.toLowerCase(right) - Character.toLowerCase(left) != 0 ) return false;
            } 
            else if ( !Character.isLetterOrDigit(right)) r++;
            else if ( !Character.isLetterOrDigit(left)) l--;
    
        }
        return true;
    }
}