class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        for (int i = 0 ; i < s.length(); i ++) {
            String oddMax = "", evenMax =  "", currentMax= "";
            // if odd

            oddMax = helper(s, s.substring(i,i+1), i - 1, i + 1);

            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i+1)) {
                evenMax = helper(s, s.substring(i, i+2), i - 1, i + 2);
            }
            // System.out.println(oddMax);
            // System.out.println(evenMax);
            currentMax = oddMax.length() < evenMax.length() ? evenMax : oddMax;
            max = max.length() < currentMax.length() ? currentMax : max;
        }
        return max;
    }

    private String helper(String s, String current, int start, int end) {
        boolean matched = true;
        int total = 0;
        while (start >= 0 && end < s.length() && matched) {
            if (s.charAt(start) == s.charAt(end)) {
                current = s.charAt(start) + current + s.charAt(end);
            } else {
                matched = false;
            }
            start --;
            end ++;
        }
        return current;
    }
}