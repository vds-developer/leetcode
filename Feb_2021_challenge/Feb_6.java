import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Feb_6 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new LinkedList();
        Queue<TreeNode> s = new LinkedList<>();
        if (root == null ) return l;
        s.add(root);
        traverseRightSide(l, s);
        return l;
        
    }

    private void traverseRightSide(List l, Queue<TreeNode> q) {
    	if (q.peek() == null) return;
    	// populate queue with next values
    	Queue<TreeNode> nextPossible = new LinkedList<>();
    	TreeNode lastInRow = null;
    	while (q.peek() != null) {
    		TreeNode t = q.remove();
    		if (t.left != null) nextPossible.add(t.left);
    		if(t.right != null) nextPossible.add(t.right);
    		lastInRow = t;
    	}
    	l.add(lastInRow.val);
    	traverseRightSide(l, nextPossible);
    }
}