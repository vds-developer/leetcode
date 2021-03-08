package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.*;

/*
A wall consists of several rows of bricks of various integer lengths and uniform height. 
Your goal is to find a vertical line going from the top to the bottom of the wall that cuts through the fewest number of bricks. 
If the line goes through the edge between two bricks, this does not count as a cut.

For example, suppose the input is as follows, where values in each row represent the lengths of bricks in that row:

[[3, 5, 1, 1],
 [2, 3, 3, 2],
 [5, 5],
 [4, 4, 2],
 [1, 3, 3, 3],
 [1, 1, 6, 1, 1]]
The best we can we do here is to draw a line after the eighth brick, which will only 
require cutting through the bricks in the third and fifth row.


input
3 5 1 1
2 3 3 2
5 5
4 4 2
1 3 3 3
1 1 6 1 1

*/

public class Coding281  {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		final int rows;

		try {
			Solver solver = new Solver();
			String s;
			List<List<Integer>> input = new LinkedList<List<Integer>>();
			int i = 0;
			while ((s=br.readLine())!=null && s.length() != 0) {
				// List<Integer> t = ;
				input.add(Stream.of(s.split(" "))
					.map(n -> Integer.parseInt(n))
					.collect(Collectors.toList()));
				// input.add(Arrays.stream(s.split(" ")).mapToInt(Integer::new).toArray());
			}
			solver.solve(input.stream()
				.map( l -> l.stream().mapToInt(e -> e).toArray())
				.toArray(int[][] :: new));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the final output
		System.out.println(output);
	}
}

class Solver {


	public void solve(int[][] input) {	
		// key is position of brick, value is a counter where we don't need a cut through a brick.
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int rows = input.length;
		for (int i = 0; i<rows; ++i) {
			int brick = input[i].length;
			int count = 0;
			for (int j = 0; j < brick -1  ; ++j) {
				count += input[i][j];
				if (m.containsKey(count)) {
					int oldValue = m.get(count);
					m.replace(count, oldValue, oldValue + 1);
				} else {
					m.put(count, 1);
				}
			}
		}
		// will be initilized
		int max = 0;
		for (Integer key : m.keySet()) {
			if (m.get(key) > max) max = m.get(key);
		}
		Coding281.output += "The min number of bricks we cut through is " + (rows - max);
	}

 }
