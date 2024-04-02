package com.org.ds.v3.lohia.array;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/description/
 *
 * You are given an m x n integer matrix matrix with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 *
 * https://www.youtube.com/watch?v=RhPqIIOUiS8&list=PLFdAYMIVJQHPlQ0vhbV6FVL-1dWNmJcYJ&index=50
 */

// log(m*n)
public class C49_SearchA2DMatrix {

  boolean searchMatrix(int[][] matrix, int target) {

    int rowIdx = searchPotentialRow(matrix, target);
    if (rowIdx != -1)
      return binarySearchOverRow(rowIdx, matrix, target);
    return false;
  }

  private int searchPotentialRow(int[][] matrix, int target) {
    int low = 0;
    int high = matrix.length - 1;
    int idx = matrix[0].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[mid][0] <= target && target <= matrix[mid][idx]) {
        return mid;
      }
      else if (matrix[mid][0] < target) low = mid + 1;
      else if (matrix[mid][0] > target) high = mid - 1;
    }
    return -1;
  }

  private boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target) {
    int low = 0;
    int high = matrix[rowIdx].length - 1;
    while (low <= high) {
      int mid = low + (high - low)/2;

      if (matrix[rowIdx][mid] == target) {
        return true;
      }
      else if (matrix[rowIdx][mid] > target) high = mid - 1;
      else low = mid + 1;
    }
    return false;
  }

}