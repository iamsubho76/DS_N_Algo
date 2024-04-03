package com.org.ds.v1.array;

public class D3_FindAllSubArrForTheGivenNumber {

    public static void find(int[] A, int currSum, int index, int sum, int[] solution) {
        if (currSum == sum) {

            System.out.print("Output: [");
            for (int i = 0; i < solution.length; i++) {
                if (solution[i] == 1) {
                    if (A[i] != 0) {
                        System.out.print("  " + A[i]);
                    }
                }
            }
            System.out.print(" ]\n");

        } else if (index == A.length) {
            return;
        } else {
            solution[index] = 1;// select the element
            currSum += A[index];
//            System.out.println("array1 index::" + index);
//            System.out.println("array1 index value::" + A[index]);
//            System.out.println("currSum1::" + currSum);

            find(A, currSum, index + 1, sum, solution);
            currSum -= A[index];
//            System.out.println("array2 index::" + index);
//            System.out.println("array2 index value::" + A[index]);
//            System.out.println("currSum2::" + currSum);

            solution[index] = 0;// do not select the element
            find(A, currSum, index + 1, sum, solution);
        }
        return;
    }


    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("How many integer you have to insert: ");
//        int n = in.nextInt();
//        int[] A = new int[n];
//        System.out.println("\nEnter elements in Array:\n ");
//        for (int i = 0; i < A.length; i++) {
//            A[i] = in.nextInt();
//        }
//        System.out.println("\nEnter required sum: ");
//        int sum = in.nextInt();
        int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 6;
        int[] solution = new int[A.length];

        find(A, 0, 0, sum, solution);
    }
}