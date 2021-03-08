package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Manacher's Algorithm
public class SortArrayByParity {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		final int cases;

		try {
			cases = Integer.parseInt(br.readLine().trim());
			Questions.Solver solver = new Questions.Solver();
			for (int i = 0; i < cases; i++) {
				output += "Case #" + i + "\n";
				String[] stringArray = br.readLine().split(" ");
				// convert to int
				int[] intArray = new int[stringArray.length];
				for (int q = 0 ; q < stringArray.length; ++q ) {
					intArray[q] = Integer.parseInt(stringArray[q]);
				}
				solver.solve(intArray);
				output += "\n\n";
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the final output
		System.out.println(output);
	}
}

class Solver {


	public void solve(int[] a) {	

		int size = a.length;
		
		String even = "";
		String odd = "";

		// List<Integer> even = LinkedList<Integer>();
		// List<Integer> odd = LinkedList<Integer>();

		for (int i = 0; i < size; ++i ) {
			if ((a[i] & 1) == 0) even += a[i] + " ";
			else odd += a[i] + " ";
			// System.out.println("Iteration: " + i);
			// System.out.println("odd: " + odd);
			// System.out.println("even: " + even);
		}
		SortArrayByParity.output += "Even: " + even;
		SortArrayByParity.output += "\n";
		SortArrayByParity.output += "Odd: " + odd;
		
	}

 }
