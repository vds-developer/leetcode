
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Question
A classroom consists of N students, whose friendships can be represented 
in an adjacency list. For example, the following descibes a situation 
where 0 is friends with 1 and 2, 3 is friends with 6, and so on.

{0: [1, 2],
 1: [0, 5],
 2: [0],
 3: [6],
 4: [],
 5: [1],
 6: [3]} 
Each student can be placed in a friend group, which can be defined as the 
transitive closure of that student's friendship relations. In other words, 
this is the smallest set such that no student in the group has any friends outside 
this group. For the example above, the friend groups would be {0, 1, 2, 5}, {3, 6}, {4}.*/


/*
Input 
0 1 2
1 0 5
2 0
3 6
4 
5 1
6 3


0 4 2
1 
2 
3 
4 6
5 
6 4
*/




public class MinimumSubSetCover {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		final int cases;

		try {
			Solver solver = new Solver();
			String str = "";
			Map<Integer, List<Integer>> m = new HashMap<Integer, List<Integer>>();
			while((str=br.readLine()) !=null && str.length() != 0 ) {
				// System.out.println("Test");
				String[] stringArray = str.split(" ");
				List<Integer> list = new LinkedList<Integer>();
				for ( int i = 1; i < stringArray.length ; ++i ) {
					list.add(Integer.parseInt(stringArray[i]));
				}
				m.put(Integer.parseInt(stringArray[0]), list);

			}

		
			// generate map

			solver.solve(m);
			output += "\n\n";
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the final output
		System.out.println(output);
	}
}

class Solver {


	public void solve(Map<Integer, List<Integer>> m) {	
		List<Integer> needsASubset = new LinkedList<Integer>();
		List<List<Integer>> results = new LinkedList<List<Integer>>();
		for(Integer i : m.keySet()){
			needsASubset.add(i);
		}


		while (needsASubset.size() != 0) {
			List <Integer> currentSubset = new LinkedList<Integer>();
			Integer currentKey = needsASubset.remove(0);
			Stack<Integer> subset = new Stack<Integer>();
			currentSubset.add(currentKey);
			for (Integer i : m.get(currentKey)) {
				subset.push(i);
			}
			while(!subset.empty()) {
				Integer subsetCurrentKey = subset.pop();
				currentSubset.add(subsetCurrentKey);
				needsASubset.remove(subsetCurrentKey);
				for (Integer i : m.get(subsetCurrentKey)) {
					if (!currentSubset.contains(i))subset.push(i);
				}
			}
			results.add(currentSubset);
		}

		for (List<Integer> l : results) {
			MinimumSubSetCover.output += " {";
			for (Integer i : l) {
				MinimumSubSetCover.output += i +  " ";
			}
			MinimumSubSetCover.output.trim();
			MinimumSubSetCover.output += "}";
		}
		
		
	}



 }
