class Feb_11 {
    public boolean isAnagram(String s, String t) {
    	Map<Character,Integer> m = new HashMap<>();
        if ( s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); ++i) {
        	m.put(s.charAt(i),  m.getOrDefault(s.charAt(i), 0) + 1);
        	m.put(t.charAt(i),  m.getOrDefault(t.charAt(i), 0) - 1);
        }
       	for (Character k : m.keySet()) {
       		if (m.get(k) != 0) return false;
       	}


        return true;
    }
}