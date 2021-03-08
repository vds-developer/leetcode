public class Mar_7{
    class MyEntry {
        public int value;
        public int key;
        public MyEntry next;
        public MyEntry(int key, int value) {
            this.value = value;
            this.key = key;
            next = null;
        }
    }
    
    MyEntry[] e = new MyEntry[100000];
    
    private int mHash(int key) {
        return Integer.hashCode(key) % e.length;
    }
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = mHash(key);
        if (e[index] == null) {
            e[index] = new MyEntry(key, value);
        } else {
            for (MyEntry i = e[index]; i != null; i = i.next) {
                if (i.key == key) {
                    i.value = value;
                    break;
                }
                if (i.next == null) {
                    i.next = new MyEntry(key, value);
                }
            }
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = mHash(key);
        for (MyEntry i = e[index]; i != null; i = i.next) {
            if (i.key == key) {
                return i.value;
            }
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = mHash(key);
        MyEntry prev = null;
        for (MyEntry i = e[index]; i != null; i = i.next) {
            if (i.key == key) {
                if (prev == null) {
                    e[index] = i.next;
                } else {
                    prev.next = i.next;
                }
                break;
            }
            prev = i;
        }
    }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
}