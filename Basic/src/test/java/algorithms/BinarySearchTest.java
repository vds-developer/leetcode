package algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    BinarySearch binarySearch;
    @BeforeEach
    public void setup() {
        int[] input = new int[] {-3,1, 3, 4, 6, 11, 23, 44};
        binarySearch = new BinarySearch(input);
    }

    @Test
    public void contains() {
        Assert.assertTrue(binarySearch.contains(4));
        Assert.assertTrue(binarySearch.contains(-3));
        Assert.assertTrue(binarySearch.contains(44));
        Assert.assertFalse(binarySearch.contains(55));
        Assert.assertFalse(binarySearch.contains(-9));
        Assert.assertFalse(binarySearch.contains(5));
    }

    @Test
    public void indexOf() {
//        Assert.assertEquals(binarySearch.indexOf(-3), 0);
//        Assert.assertEquals(binarySearch.indexOf(-4), 0);
//        Assert.assertEquals(binarySearch.indexOf(6), 4);
//        Assert.assertEquals(binarySearch.indexOf(44), 7);
        Assert.assertEquals(binarySearch.indexOf(2323), 8);
//        Assert.assertEquals(binarySearch.indexOf(30), 7);
    }
}