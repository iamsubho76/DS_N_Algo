package com.org.ds.v1.recursion;

public class TestMergeSort {
	public static void main(String[] args) {

		// Threaded merge sort (and printing)
		int[] toSort = { 191, 2, 3, 5, 6, 7, 5, 3, 21, 3, 4 };
		printArr(toSort);
		concurrentMergeSort(toSort);
		printArr(toSort);
	}

	public static void concurrentMergeSort(int[] toSort) {
		int[] tmpArray = new int[toSort.length];

		try {
			// Start the mergesort
			ThreadConcurrentMergeSort sort = new ThreadConcurrentMergeSort(toSort,tmpArray, 0, toSort.length - 1);
			sort.start();
			sort.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ,");
		}
		System.out.println();
	}
}
