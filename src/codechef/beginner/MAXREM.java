package codechef.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MAXREM {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxRem(arr);
	}

	public static void maxRem(int[] arr) {

		int n = arr.length, i;

		Arrays.sort(arr);
		int max = arr[n - 1];
		for (i = n - 1; i >= 0; i--) {
			if (max > arr[i]) {
				max = arr[i];
				break;
			}
		}
		if (max == arr[n - 1])
			System.out.println(0);
		else
			System.out.println(max);
	}
}