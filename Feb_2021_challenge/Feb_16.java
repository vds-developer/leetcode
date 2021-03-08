public class Feb_16 {
	public List<String> letterCasePermutation(String s) {
		Set<String> list = new HashSet();
		list.add(new String(s));
		Queue<Integer> isAlphabetic = new LinkedList();
		for (int i = 0; i < s.length(); ++i ){
			if (Character.isAlphabetic(s.charAt(i))) {
				isAlphabetic.add(i);
			}
		}
		char [] c = s.toCharArray();
		for(Integer j : isAlphabetic ) {
			Set<String> next = new HashSet(list);
			for (String k : next) {
				char[] tmp = k.toCharArray();
				tmp[j] = Character.toUpperCase(tmp[j]);
				String u = new String(tmp);
				tmp[j] = Character.toLowerCase(tmp[j]);
				String l = new String(tmp);
				list.add(u);
				list.add(l);
			}

		}
		return new ArrayList<>(list);
    }

}