public class Feb_19 {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack();
        List<Integer> delete = new LinkedList();
        // ascii of '(''  is 40, ')' is 41
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < s.length(); ++i ) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (! stack.isEmpty()) {
                    stack.pop();
                } else {
                    delete.add(i);
                }
            } 
        }
        
        while(! stack.isEmpty()) {
            delete.add(stack.pop());
            
        }
        for(int i = 0; i < s.length(); ++i) {
            if (!delete.contains(i)) {
                build.append(s.charAt(i));
            }
        }
        return build.toString();
    }
}