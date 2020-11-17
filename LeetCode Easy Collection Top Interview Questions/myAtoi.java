class Solution {
    public int myAtoi(String s) {
        String convertString = s.strip();
        int n = convertString.length();
        String result = "";
        for(int i = 0; i < n; ++i) {
            if ( i == 0 && ( convertString.charAt(i) == '-' || convertString.charAt(i) == '+' )) {
                result += convertString.charAt(i);
            }
            else if (Character.isDigit(convertString.charAt(i))) {
                result += convertString.charAt(i);
            }else {
                return convertResults(result);
            }
        }
        return convertResults(result);
    }
    
    private int convertResults(String s ) {
        try {
            if (s.isEmpty() || ((s.charAt(0) == '-' || s.charAt(0) == '+') && s.length() == 1)) return 0;
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            if (s.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }

    }
}