package algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    MergeSort mergeSort;



    @BeforeEach
    public void setup() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMerge() {
        Random random = new Random();
        int r = random.nextInt(20);
        System.out.println(r);
        int[] experiment = new int[r];
        for (int i = 0 ; i < r; i++) {
            experiment[i] = random.nextInt(1000);
            System.out.print(experiment[i] + " ");
        }
        System.out.println();
        int[] result = mergeSort.mergeSort(experiment);
        Assert.assertTrue(mergeSort.isSorted(result));
        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}