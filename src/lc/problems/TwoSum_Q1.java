package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoSum_Q1 {

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());

		int i;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int[] result;
		result = sumIndices(arr, target);
		printArray(result);
	}

	public static int[] sumIndices(int[] arr, int target) {

		int n = arr.length, i, max = Integer.MIN_VALUE;

		int[] result = new int[2];
		for (i = 0; i < n - 1; i++) {
			boolean done = false;
			for (int j = i + 1; j < n; j++)
				if (arr[i] + arr[j] == target) {
					result[0] = i;
					result[1] = j;
					done = true;
					break;
				}
			if (done)
				break;
		}
		return result;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
