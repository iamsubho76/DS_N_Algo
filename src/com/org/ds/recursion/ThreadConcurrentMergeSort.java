package com.org.ds.recursion;

public class ThreadConcurrentMergeSort extends Thread{

    private int[] a;
    private int[] tmpArray;
    private int left;
    private int right;

    public ThreadConcurrentMergeSort(int[] a, int[] tmpArray, int left, int right){
        this.a = a;
        this.tmpArray = tmpArray;
        this.left = left;
        this.right = right; 
    }

    public void run(){
        if(this.left < this.right){
            try{
                int center = ( this.left + this.right ) / 2;
                ThreadConcurrentMergeSort p = new ThreadConcurrentMergeSort(this.a, this.tmpArray, this.left, center);
                ThreadConcurrentMergeSort q = new ThreadConcurrentMergeSort(this.a, this.tmpArray, center + 1, this.right);
                ThreadConcurrentMerge r = new ThreadConcurrentMerge(this.a, this.tmpArray, this.left, center + 1, this.right);

                // Sort
                p.start();
                q.start();
                p.join();
                q.join();

                // Merge
                r.start();
                r.join();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public int[] getA(){
        return this.a;
    }
}
