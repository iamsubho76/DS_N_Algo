package com.org.ds.v1.array;// Java implementation of the approach

//https://www.geeksforgeeks.org/print-all-the-peaks-and-troughs-in-an-array-of-integers/
class D12_AllPeakElements
{

	// Function that returns true if num is
	// greater than both arr[i] and arr[j]
	static boolean isPeak(int arr[], int n, int num,
									int i, int j) 
	{

		// If num is smaller than the element
		// on the left (if exists)
		if (i >= 0 && arr[i] > num)
		{
			return false;
		}

		// If num is smaller than the element
		// on the right (if exists)
		if (j < n && arr[j] > num)
		{
			return false;
		}
		return true;
	}

	// Function that returns true if num is
	// smaller than both arr[i] and arr[j]
	static boolean isTrough(int arr[], int n, int num,
										int i, int j)
	{

		// If num is greater than the element
		// on the left (if exists)
		if (i >= 0 && arr[i] < num) 
		{
			return false;
		}

		// If num is greater than the element
		// on the right (if exists)
		if (j < n && arr[j] < num) 
		{
			return false;
		}
		return true;
	}

	static void printPeaksTroughs(int arr[], int n)
	{
		System.out.print("Peaks : ");

		// For every element
		for (int i = 0; i < n; i++) 
		{

			// If the current element is a peak
			if (isPeak(arr, n, arr[i], i - 1, i + 1))
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println("");

		System.out.print("Troughs : ");

		// For every element
		for (int i = 0; i < n; i++)
		{

			// If the current element is a trough
			if (isTrough(arr, n, arr[i], i - 1, i + 1)) 
			{
				System.out.print(arr[i] + " ");
			}
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = {5, 10, 5, 7, 4, 3, 5};
		int n = arr.length;

		printPeaksTroughs(arr, n);
	}
}

// This code is contributed by Rajput-Ji
