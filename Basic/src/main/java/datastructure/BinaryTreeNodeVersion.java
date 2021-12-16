package datastructure;

public class BinaryTreeNodeVersion<E extends Comparable<E>> {
    class Node<E extends Comparable<E>> {
        E value;
        Node<E> left, right;

        Node(E val) {
            this.value = val;
        }

        public int compare(Node<E> val2) {
            return value.compareTo(val2.value);
        }
    }
    Node<E> root;


    public void BinaryTreeListVersion() {
        root = new Node<E>(null);
    }

    public void add(E val) {
        Node<E> n = new Node<E>(val);
        addRecursive(n, root);
    }

//    public boolean remove(E val) {
//
//    }

    private boolean removeRecursive(Node<E> remove, Node<E> cur, Node<E> parent) {
        if (cur == null) return false;
        if (remove.compare(cur) < 0) {
            return removeRecursive(remove, cur.left, cur);
        } else if (remove.compare(cur) > 0) {
            return removeRecursive(remove, cur.right, cur);
        } else {
            remove.left = cur.left;
            remove.right = cur.right;
            if (parent != null) {
                if (remove.compare(parent) < 0)  {
                    parent.left = remove;
                } else {
                    parent.right = remove;
                }
            }
            return true;
        }
    }

    public Node<E> find(E val) {
        Node<E> find = new Node<>(val);
        return findRecursive(find, root);
    }

    private Node<E> findRecursive(Node<E> n, Node<E> cur) {
        if (cur == null) return null;
        if (n.compare(cur) < 0) {
            return findRecursive(n, cur.left);
        } else if (n.compare(cur) > 0) {
            return findRecursive(n, cur.right);
        } else {
            return cur;
        }
    }

    public void addRecursive(Node<E> add, Node<E> cur) {
        if (add.compare(cur) < 0) {
            if (cur.left == null) {
                cur.left = add;
                return;
            }
            addRecursive(add, cur.left);
        } else {
            if (cur.right == null) {
                cur.right = add;
                return;
            }
            addRecursive(add, cur.right);
        }
    }
}
