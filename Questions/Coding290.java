package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
On a mysterious island there are creatures known as Quxes which come
 in three colors: red, green, and blue. One power of the Qux is that if two of
  them are standing next to each other, they can transform into a single creature of the third color.

Given N Quxes standing in a line, determine the smallest number 
of them remaining after any possible sequence of such transformations.

For example, given the input ['R', 'G', 'B', 'G', 'B'],
 it is possible to end up with a single Qux through the following steps:

        Arrangement       |   Change
----------------------------------------
['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
['B', 'B', 'G', 'B']      | (B, G) -> R
['B', 'R', 'B']           | (R, B) -> G
['B', 'G']                | (B, G) -> R
['R']                     |



r g b g b
*/




public class Coding290 {
	
public static String output = "\n\n";

	// Program's starting point
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			Solver solver = new Solver();
			String[] stringArray = br.readLine().split(" ");
			solver.solve(stringArray);
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


	public void solve(String[] s) {
		List<String> l = new LinkedList<String>(Arrays.asList(s));
		outerloop:
		while(l.size() > 1) {
			for(int i = 0; i < l.size() -1 ; ++i  ) {
				if (! l.get(i).equals(l.get(i+1))) {
					String thrid = getThirdColor(l.get(i), l.get(i+1));
					l.remove(i+1);
					l.remove(i);
					l.add(i, thrid);
					break;
				}
				if( i == l.size() - 2) break outerloop;
			}

			
		}

		for (String k : l) {
			Coding290.output += k + " ";
			
		}
	}

	private String getThirdColor(String s, String a) {
		if(s.equals("r") ){
			if(a.equals("b")){
				return "g";
			}else {
				return "b";
			}
		}else if (s.equals("b")) {
			if(a.equals("r")){
				return "g";
			}else {
				return "r";
			}
		}else{
			if(a.equals("b")){
				return "r";
			}else {
				return "b";
			}
		}

	}

 }

