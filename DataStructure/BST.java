
public class BST {
	private Node root;


	public Node getBSTRoot() {return root}


	public void add(int value) {
		if (root == null) {
			root = new Node(value);
		} else {
			searchAndAdd(root);
		}
	}


	private void searchAndAdd(int value, Node node) {
		if ( value <= node.value ) {
			if (node.left != null ) {
				searchAndAdd(value, node.left);
			} else {
				node.left = new Node(value);
			}
		} else {
			if(node.right != null ) {
				searchAndAdd(value, node.right);
			} else {
				node.right = new Node(value);
			}
		}

	}

	public void contains( int value ) {
		searchAndContainsValue(value, root);
	}

	public boolean searchAndContainsValue( int value, Node node ) {
		if ( node.value == value ) {
			return true
		}
		if ( node.value > value && node.left != null) {
			return searchAndContainsValue( value, node.left )
		} else if ( node.value < value && node.right != null ) {
			return searchAndContainsValue ( value, node.right )
		} else {
			return false
		}
	}


	private class Node {
		Node left;
		Node right;
		int value;

		public void Node(int value) {
			this.value = value;
			this.right = null;
			this.left = null;
		}
	}
}
