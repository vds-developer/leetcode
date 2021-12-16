package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLinkedListTest {

    MyLinkedList<Integer> ll;

    @BeforeEach
    void setup() {
        ll = new MyLinkedList<Integer>();
    }

    @Test
    @DisplayName("Test Add")
    void testAdd() {
        ll.add( ll.new Node<Integer>(1));
        assertEquals(ll.peek(), 1);
        ll.add(ll.new Node<Integer>(2));
        assertEquals(ll.peek(), 2);
    }

    @Test
    @DisplayName("Test Remove")
    void testRemove() {
        ll.add( ll.new Node<Integer>(1));
        ll.remove();
        assertEquals(ll.size(), 0);
    }

    @Test
    @DisplayName("Test Combination")
    void testCombination() {
        ll.add( ll.new Node<Integer>(1));
        assertEquals(ll.size(), 1);
        ll.remove();
        assertEquals(ll.size(), 0);
    }

    @Test
    @DisplayName("Test Size")
    void testSize() {
        assertEquals(ll.size(), 0);
        ll.add( ll.new Node<Integer>(1));
        ll.add( ll.new Node<Integer>(1));
        ll.add( ll.new Node<Integer>(1));
        ll.add( ll.new Node<Integer>(1));
        assertEquals(ll.size(), 4);
    }


//    @org.junit.jupiter.api.Test
//    void add() {
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void remove() {
//
//    }


}