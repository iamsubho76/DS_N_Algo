package com.org.ds.v1.array;
//https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/?ref=roadmap

/**
 * K’th smallest element in an unsorted array using Priority Queue(Max-Heap):
 * The intuition behind this approach is to maintain a max heap (priority queue) of size K while iterating through the array. Doing this ensures that the max heap always contains the K smallest elements encountered so far. If the size of the max heap exceeds K, remove the largest element this step ensures that the heap maintains the K smallest elements encountered so far. In the end, the max heap’s top element will be the Kth smallest element.
 * <p>
 * Initialize a max heap (priority queue) pq.
 * For each element in the array:
 * Push the element onto the max heap.
 * If the size of the max heap exceeds K, pop (remove) the largest element from the max heap. This step ensures that the max heap maintains the K smallest elements encountered so far.
 * After processing all elements, the max heap will contain the K smallest elements, with the largest of these K elements at the top.
 * Below is the Implementation of the above approach:
 * <p>
 * <p>
 * Output
 * K'th smallest element is 5
 * <p>
 * <p>
 * Time Complexity: O(N2) in worst case and O(N) on average. However if we randomly choose pivots, the probability of worst case could become very less.
 * Auxiliary Space: O(N)
 */
class D8_FindKthSmallElement {
    // Standard partition process of QuickSort.
    // It considers the last element as pivot
    // and moves all smaller element to left of
    // it and greater elements to right
    public static int partition(Integer[] arr, int l, int r) {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {

                // Swapping arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        // Swapping arr[i] and arr[r]
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;

        return i;
    }

    // This function returns k'th smallest element
    // in arr[l..r] using QuickSort based method.
    // ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
    public static int kthSmallest(Integer[] arr, int l,
                                  int r, int K) {
        // If k is smaller than number of elements
        // in array
        if (K > 0 && K <= r - l + 1) {

            // Partition the array around last
            // element and get position of pivot
            // element in sorted array
            int pos = partition(arr, l, r);

            // If position is same as k
            if (pos - l == K - 1)
                return arr[pos];

            // If position is more, recur for
            // left subarray
            if (pos - l > K - 1)
                return kthSmallest(arr, l, pos - 1, K);

            // Else recur for right subarray
            return kthSmallest(arr, pos + 1, r,
                    K - pos + l - 1);
        }

        // If k is more than number of elements
        // in array
        return Integer.MAX_VALUE;
    }

    // Driver's code
    public static void main(String[] args) {
        Integer[] arr
                = new Integer[]{12, 3, 5, 7, 4, 19, 26};
        int K = 3;

        // Function call
        System.out.print(
                "K'th smallest element is "
                        + kthSmallest(arr, 0, arr.length - 1, K));
    }
}

// This code is contributed by Chhavi
