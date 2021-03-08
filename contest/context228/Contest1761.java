public class Contest1761 {
	public int minTrioDegree(int n, int[][] edges) {
        // Set<Integer> allVertices = new HashSet();
        // for(int i = 0 ; i < edges.length; ++i ) {
        // 	for(int j = 0; j < 2 ; j ++ ) {
        // 		allVertices.add(edges[i][j]);
        // 	}
        // }
        int count = 0;
        for (int i = 1; i <= n; ++i ) {
        	Stack<Integer> neighboors = new LinkedList();
        	for (int j = 0; j < edges.length; ++j) {
	    		if (edges[j][0] == i) {
	    			neighboors.add(edges[j][1]);
	    		}
    		}
    		count += findOutDegree(i, edges, 1, neighboors);
        }

    }

    private int findOutDegree(int startingNode, int[][] edges, int distance, Stack<integer> neigboors) {


    	if (distance == 3) {
    		int count = 0;
    		while(!neighboors.empty()) {
    			if (neighboors.pop() == startingNode) {
    				++count;
    			}
    		}
    		return count;
    	} else {
    		Stack<Integer> newNeighboors = new LinkedList();
    		for(Integer n : neighboors) {
    			for (int i = 0; i < edges.length; ++i) {
    				if (edges[i][0] == n) {
    					newNeighboors.add(edges[i][1]);
    				} else if (edges[i][1] == n) {
    					
    				}
    			}
    		}
    	}

    	return findOutDegree(startingNode, edges, distance + 1, newNeighboors);
    }
}