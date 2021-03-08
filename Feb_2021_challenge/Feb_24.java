public class Feb_24 {

	public int scoreOfParentheses (String s) {
		Stack<Integer> stack = new Stack();
		int i = 0;
		// will queue m or p for multiple or plus.
		while(i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add(0);
            } 
            if (c == ')') {
                int tmp = 0;
                int t = stack.pop();
                if (t > 0) {
                    tmp = t * 2;
                } else {
                    tmp = 1;
                }
                int a = 0;
                if (!stack.isEmpty()) {
                    a = stack.pop();
                    System.out.println(a);
                }
                System.out.println(tmp + a);
                stack.add(tmp + a);
            }
			++i;
		}
        return stack.pop();

	}

}