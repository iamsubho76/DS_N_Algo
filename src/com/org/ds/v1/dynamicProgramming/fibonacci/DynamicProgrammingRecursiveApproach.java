package com.org.ds.v1.dynamicProgramming.fibonacci;

import java.util.Scanner;

//https://www.youtube.com/watch?v=5dRGRueKU3M

public class DynamicProgrammingRecursiveApproach {
    // Declaring global array large enough
    static int array[] = new int[1000];

    public static int fib(int n) {
        if (n == 1) {
            return array[0];
        }
        // base cases
        if (n == 2) {
            return array[1];
        } else {
            array[n - 1] = fib(n - 1) + fib(n - 2);
            return (array[n - 1]);
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner snr = new Scanner(System.in);
        n = snr.nextInt();
        snr.close();
        array[0] = 0;
        array[1] = 1;
        System.out.println(fib(n));
        // printing number in fibonacci series
    }
}
