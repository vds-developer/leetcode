package contest.contest226;

import java.util.*;


class Contest5665 {
       public int[] restoreArray(int[][] adjacentPairs) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        HashMap<Integer, LinkedList<Integer>> lookup = new HashMap<>();
        int n = adjacentPairs.length;
        int m = 2;
        for (int row = 0 ; row < n; row ++ ) {
            // get next adjecent pair
            LinkedList<Integer> tmp1 = lookup.getOrDefault(adjacentPairs[row][0], new LinkedList<Integer>());
            tmp1.add(adjacentPairs[row][1]);

            LinkedList<Integer> tmp2 = lookup.getOrDefault(adjacentPairs[row][1], new LinkedList<Integer>());
            tmp2.add(adjacentPairs[row][0]);

            lookup.put(adjacentPairs[row][0], tmp1);
            lookup.put(adjacentPairs[row][1], tmp2);

        }

        Integer ff = adjacentPairs[0][0];       
        if (!lookup.get(ff).isEmpty()) {
            Integer tmpf = lookup.get(ff).remove();
            if (! lookup.get(tmpf).isEmpty()) {
                 lookup.get(tmpf).remove(ff);
            }
                    ll.addFirst(tmpf);
        }
       
        
        int count = n - 1;
        while ( n > 0 ) {
            Integer f = ll.getFirst();
            Integer l = ll.getLast();
            System.out.println(l);
            Integer tmp = null;
            if (! lookup.get(f).isEmpty()) {
                tmp = lookup.get(f).remove();
                if( ! lookup.get(tmp).isEmpty()) lookup.get(tmp).remove(f);
                ll.addFirst(tmp);
                n --;
            } else if (! lookup.get(l).isEmpty() ) {
                tmp = lookup.get(l).remove();
                if( ! lookup.get(tmp).isEmpty()) lookup.get(tmp).remove(l);
                ll.addLast(tmp);
                n --;
            } else { 
                System.out.println("error");
                break; }
        }
         return ll.stream().mapToInt(i->i).toArray();


    }



    public static void main(String[] args) {
    	Contest5665 s = new Contest5665();
        int[][] input = {{2,1},{3,4},{3,2}};

    	int[] result = s.restoreArray(input);
        for(int i : result) {
            System.out.println(i);
        }
    	
    }
}