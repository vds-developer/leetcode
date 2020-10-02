
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding307 {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer st = new StringTokenizer(br.readLine()); 
		final int cases;

		try {
			cases = Integer.parseInt(br.readLine().trim());
			Solver solver = new Solver();
			for (int i = 0; i < cases; i++) {
				output += "Case #" + i + "\n";
				String[] stringArray = br.readLine().split(" ");
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


	public void solve(String s) {	
		Coding307.output += s;
		
	}

 }
