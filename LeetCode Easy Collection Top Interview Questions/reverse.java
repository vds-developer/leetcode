class Solution {
    public int reverse(int x) {
        char[] c = Integer.toString(x).toCharArray();

        int start = 0;
        boolean signed = false;
        if (c[0] == '-') {
            signed= true;
            start = 1;
        }
        int n = c.length;
        for( int i = start ; i < ( n + start )/2 ; ++i) {
            char temp = c[i];
            int end = n - i - 1;
            if (signed) {
                end = n - i ;
            }
            System.out.println(end);
            System.out.println(i);
            c[i] = c[end];
            c[end] = temp;
        }
        try {
            return Integer.valueOf(String.valueOf(c));
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}