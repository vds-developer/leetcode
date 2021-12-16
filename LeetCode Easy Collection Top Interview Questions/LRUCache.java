import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {
    private HashMap<Integer, Integer> hmap;
    private LinkedList<Integer> linkedList;
    private int capacity;

    public LRUCache(int capacity) {
        hmap = new HashMap(capacity);
        linkedList = new LinkedList<Integer>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        Integer r = hmap.get(key);
        if (r != null ) {
            if(linkedList.contains(key)) {
                linkedList.remove(linkedList.indexOf(key));
            }
            linkedList.add(key);
            return r;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (linkedList.contains(key) ) {
            linkedList.remove(linkedList.indexOf(key));
        } else if (linkedList.size() == capacity ) {
            int evict = linkedList.remove();
            hmap.remove(evict); 
        }
        linkedList.add(key);
        hmap.put(key, value);
       
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */