package datastructure;


// Should extends AAbstractSequentialList<E>
public class MyLinkedList<E>  {
    Node<E> root;
    Node<E> cur;
    int size;
    public class Node<E> {
        Node next;
        E value;
        public Node(E value) {
            this.value = value;
        }
    }

    public MyLinkedList () {
        size = 0;
    }

    public boolean add (Node<E> node) {
        if (root == null) {
            root = node;
        } else {
            cur.next = node;
        }
        cur = node;
        size ++;
        return true;
    }

    public E remove () {
        Node<E> node = root;
        if (node == null) return null;
        root = root.next;
        node.next = null;
        size --;
        return node.value;
    }

    public int size() {
        return size;
    }

    public E peek() {
        return cur.value;
    }
}
