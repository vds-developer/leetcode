package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
3
1 3 2 4 8 9 10 7 6 5 11 12 13 14
1 2 3 4 5
5 4 3 2 1

*/

public class SmallestLengthUnsortedArraySortMakesWholeThingSorted {
	
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
				int[] a = new int[stringArray.length];
				for (int j =0; j < stringArray.length; j++) {
					a[j] = Integer.parseInt(stringArray[j]);
				}
				solver.solve(a);
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
		int minInUnsorted = Integer.MAX_VALUE;
		int maxInUnsorted = Integer.MIN_VALUE;
		int n = a.length;
		for (int i : a) {
			System.out.print(i + " ");
			
		}
		boolean isRising = true;
		boolean isUnsorted = false;
		for (int i = 0; i < n  ; i++) {
			if (isRising) {
				if (i < n- 1 && a[i] > a[i+1]) {
					isRising = false;
					isUnsorted = true;
				}
				if (isUnsorted && !isRising && maxInUnsorted < a[i]) maxInUnsorted = a[i];
			}else {
				if( i < n -1 && a[i] < a[i+1]) isRising = true;
				if (isRising && minInUnsorted > a[i]) minInUnsorted = a[i];
			}
		}
		System.out.println();
	
		System.out.println(minInUnsorted);
			System.out.println(maxInUnsorted);

		// edge case


		int minIndex = 0;
		boolean foundMinIndex = false;
		int maxIndex = n;
		boolean foundMaxIndex = false;

		if (minInUnsorted == Integer.MAX_VALUE) minIndex = 0;
		if (maxInUnsorted == Integer.MIN_VALUE) maxIndex = 0;
		for (int i = 0 ; i < n; ++i ) {
			if (!foundMinIndex && a[i] > minInUnsorted) {
				minIndex = i;
				foundMinIndex = true;
			}
			if (!foundMaxIndex &&  i < n - 1 && a[i + 1 ] > maxInUnsorted) {
				maxIndex = i ;
				foundMaxIndex = true;
			}
		}

		if (minIndex > maxIndex) maxIndex = minIndex;
		SmallestLengthUnsortedArraySortMakesWholeThingSorted.output += "(" + minIndex + ", " + maxIndex + ")";
		
	}

 }
