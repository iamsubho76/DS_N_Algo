package com.org.ds.v1.dynamicProgramming.fibonacci;

class RecursiveApproach {
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(
                n + "th Fibonacci Number: " + fib(n));
    }
}