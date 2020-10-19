class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean add = true;
        int current = n - 1;
        while (add && current >= 0) {
            if ( digits[current] == 9 ) {
                add = true;
            } else {
                add = false;
            }
            digits[current] = (digits[current] + 1) % 10;
            current --;
        }
        int[] sol;
        if (digits[0] == 0) { 
            sol = new int[digits.length + 1];
            sol[0] = 1;
            for (int i = 1; i < n + 1; ++i) {
                sol[i] = digits[i-1];
            }
        } else {
            sol = digits;
        }
        return sol;
    }
}