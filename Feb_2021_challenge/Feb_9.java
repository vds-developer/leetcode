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
class Feb_9 {
    public TreeNode convertBST(TreeNode root) {
        postOrderTraverse(root, 0);
        return root;
    }

    private int postOrderTraverse(TreeNode root, int runningSum) {
    	if (root == null) return runningSum;
    	runningSum = postOrderTraverse(root.right, runningSum);
    	root.val += runningSum;
    	runningSum = root.val;
    	runningSum = postOrderTraverse(root.left, runningSum);
    	return runningSum;
    }
}