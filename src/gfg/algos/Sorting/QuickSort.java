package gfg.algos.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), i;
		int arr[] = new int[n];
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(br.readLine());

		printArray(arr);

		quickSort(arr, 0, n - 1);
		printArray(arr);
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int q = partition(arr, start, end);
			quickSort(arr, start, q - 1);
			quickSort(arr, q + 1, end);
		}
	}

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		int j, temp;
		for (j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i + 1;
	}

	public static void printArray(int[] array) {
		int i;
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
