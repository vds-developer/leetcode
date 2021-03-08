/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Feb_10 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> m = new HashMap<>();
        Node currentHead1 = head;
        while(currentHead1 != null) {
            m.put(currentHead1, new Node(currentHead1.val));
            currentHead1 = currentHead1.next;
        }
        Node currentHead = head;
        while(currentHead != null ) {
            Node copyNode = m.get(currentHead);
            copyNode.next = m.get(currentHead.next);
            copyNode.random = m.get(currentHead.random);
            currentHead = currentHead.next;
        }
        return m.get(head);
    }
}