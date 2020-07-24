
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Coding295 {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		final int cases;

		try {

			Solver solver = new Solver();
			String[] stringArray = br.readLine().split(" ");
			solver.solve(Integer.parseInt(stringArray[0]));
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

	private List<Integer> calculateKthRow(List<Integer> previousRow,int k) {
		if(k==1) return previousRow;
		int n = previousRow.size();
		List<Integer> c = new LinkedList<Integer>();
		c.add(1);
		for (int i =0; i< n -1 	; i++ ) {
			c.add(previousRow.get(i) + previousRow.get(i+1));
		}
		c.add(1);
		return calculateKthRow(c, k -1 );
	}



	public void solve(int k) {
		List<Integer> r = calculateKthRow(Arrays.asList(1), k);
		for (Integer i  : r) {
			Coding295.output += i + " ";
			
		}
		Coding295.output.trim();
		
	}

 }
