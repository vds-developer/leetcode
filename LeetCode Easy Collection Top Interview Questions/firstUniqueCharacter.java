class Solution {
    public int firstUniqChar(String s) {
        
        // character is the letter, Pair is of form < # occurances, index - if multiple
        HashMap<Character, Integer> hmap = new HashMap<>();
        int n = s.length();
        for ( int i = 0; i < n; ++i ) {
            Character c = s.charAt(i);
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        
        for ( int i = 0; i < n; ++i ) {
            if (hmap.get(s.charAt(i)) == 1) {
               return i;
             }
        }
        return -1 ;
    }
}