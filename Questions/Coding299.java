package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*Each pipe has an associated cost, which the utility company would like to minimize. 
Given an undirected graph of pipe connections, 
return the lowest cost configuration of pipes such that each house has access to water.

pipes = {
    'plant': {'A': 1, 'B': 5, 'C': 20},
    'A': {'C': 15},
    'B': {'C': 10},
    'C': {}
}

plant a 1 b 5 c 20
a c 15
b c 10
c



*/

public class Coding299 {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		// final int line;

		try {
			Solver solver = new Solver();
			Map<String, Map<String, Integer>> map = new HashMap();
			String line = "";
			while((line = br.readLine()) != null && !line.trim().isEmpty()) {
				// System.out.println("line " + line);
				String[] stringArray = line.split(" ");
				// System.out.println(stringArray[0]);
				Map<String, Integer> innerMap = new HashMap<String, Integer>();
				for (int j = 1; j<stringArray.length; j += 2) {
					// System.out.println(stringArray[j] + " " + stringArray[j+1]);
					innerMap.put(stringArray[j], Integer.parseInt(stringArray[j+1]));
				}
				map.put(stringArray[0], innerMap);

			}
			solver.solve(map);
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


	public void solve(Map<String, Map<String, Integer>> input) {	
		int totalNumberOfHousesNotInList = input.size() -1 ;
		List<String> currentHouses = new LinkedList<String>();
		int totalCost = 0;
		int min = Integer.MAX_VALUE;
		// start at plant
		currentHouses.add("plant");
		String nextHouse = "";
		for (String s : input.get("plant").keySet()) {
			int value = input.get("plant").get(s);
			if (value < min) {
				min = value;
				nextHouse = s;
			}
		}
		totalCost += min;
		currentHouses.add(nextHouse);
		totalNumberOfHousesNotInList --;
		for (int i = 0; i < totalNumberOfHousesNotInList; ++i) {
			min = Integer.MAX_VALUE;
			nextHouse = "";
			for(String s : currentHouses){
				Map<String, Integer> m = input.get(s);
				for(String s1 : m.keySet() ) {
					if(!currentHouses.contains(s1) && m.get(s1) < min ) {
						min = m.get(s1);
						nextHouse = s1;
					}
				}
			}
			// System.out.println(nextHouse);
			currentHouses.add(nextHouse);
			totalCost += min;
		}
		Coding299.output += "The minimum cost is: " + totalCost; 
		
	}

 }
