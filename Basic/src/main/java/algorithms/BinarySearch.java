package algorithms;

public class BinarySearch {
    private int[] a;
   public BinarySearch(int[] a) {
       this.a = a;
   }


    public boolean contains(int i) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = ( left + right ) / 2;
            if (a[middle] ==  i) {
                return true;
            } else if (a[middle] < i ) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public int indexOf(int i) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            System.out.println(left + " " + right);
            int middle = ( left + right ) / 2;
            if (a[middle] ==  i) {
                return middle;
            } else if (a[middle] < i ) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return left;
    }
}
