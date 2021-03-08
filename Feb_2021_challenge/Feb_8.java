// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class Feb_8 implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    Integer head;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
        this.head = iterator.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.head;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer tmp = head;
        if (iterator.hasNext()) {
            this.head = iterator.next();
        } else {
            this.head = null;
        }
        
        return tmp;
        
	}
	
	@Override
	public boolean hasNext() {
	    return this.head != null;
	}
}