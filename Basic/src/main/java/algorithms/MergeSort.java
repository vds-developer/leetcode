package algorithms;

import java.util.Arrays;

public class MergeSort {
    public int[]  mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) return array;
        int middle = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, middle));
        int[] right = mergeSort(Arrays.copyOfRange(array, middle, n));
        return merge(left, right);
    }

    private int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] result = new int[n+m];

        int i = 0,j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k ++;
        }

        while (i < n ) {
            result[k] = a[i];
            i++; k++;
        }
        while (j < m) {
            result[k] = b[j];
            j++; k++;
        }
        return result;
    }

    public boolean isSorted(int[] a) {
        for (int i = 0 ; i < a.length -1 ; i++) {
            if (a[i] > a[i+1]) return false;
        }
        return true;
    }


}
