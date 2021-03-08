public class Feb_20 {
    public int romanToInt(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            int current = translate(s.charAt(i));
            if (i - 1 >= 0 ) {
                if (current == 5 && s.charAt(i - 1) == 'I') {
                i--;
                current = 4;
            } else if (current == 10 && s.charAt(i - 1) == 'I') {
                i --;
                current = 9;
            } else if (current == 50 && s.charAt(i - 1) == 'X') {
                i--;
                current = 40;
            } else if (current == 100 && s.charAt(i - 1) == 'X') {
                i--;
                current = 90;
            } else if (current == 500 && s.charAt(i - 1) == 'C') {
                i--;
                current = 400;
            } else if (current == 1000 && s.charAt(i - 1) == 'C') {
                i--;
                current = 900;
            }
            }
            count += current;
        }
        return count;
    }
    
    private int translate(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X': 
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}