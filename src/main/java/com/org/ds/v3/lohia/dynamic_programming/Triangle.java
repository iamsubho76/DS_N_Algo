package com.org.ds.v3.lohia.dynamic_programming;

import java.util.List;

/**
 * https://leetcode.com/problems/triangle/description/
 * Given a triangle array, return the minimum path sum from top to bottom.
 *
 * For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 *
 *
 *
 * Example 1:
 *
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 * Example 2:
 *
 * Input: triangle = [[-10]]
 * Output: -10
 *
 * Solution: https://www.youtube.com/watch?v=9kcZE8esf7Q&list=PLFdAYMIVJQHPXtFM_9mpwwQtIdzP6kxHS&index=4
 */
public class Triangle {

    int minimumTotal(List<List<Integer>> triangle) {

        int height = triangle.size();
        int[][] dp = new int[height + 1][height + 1];

        for (int level = height - 1; level >= 0; level--) {

            for (int i = 0; i <= level; i++) {

                // Add the minimum amongst 2 adjacent elements
                // from bottom level
                dp[level][i] = triangle.get(level).get(i)
                        + Math.min(
                        dp[level + 1][i], dp[level + 1][i + 1]);
            }

        }

        return dp[0][0];
    }

}