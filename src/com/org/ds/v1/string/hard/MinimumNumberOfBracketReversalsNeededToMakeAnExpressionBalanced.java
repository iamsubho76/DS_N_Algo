package com.org.ds.v1.string.hard;/*package whatever //do not write package name here */

import java.util.Stack;

// https://www.geeksforgeeks.org/minimum-number-of-bracket-reversals-needed-to-make-an-expression-balanced/?ref=roadmap

/**
 * Given an expression with only ‘}’ and ‘{‘. The expression may not be balanced. Find minimum number of bracket reversals to make the expression balanced.
 * Examples:
 * <p>
 * Input:  exp = "}{"
 * Output: 2
 * We need to change '}' to '{' and '{' to
 * '}' so that the expression becomes balanced,
 * the balanced expression is '{}'
 * Input:  exp = "{{{"
 * Output: Can't be made balanced using reversals
 * Input:  exp = "{{{{"
 * Output: 2
 * Input:  exp = "{{{{}}"
 * Output: 1
 * Input:  exp = "}{{}}{{{"
 * Output: 3
 * <p>
 * One simple observation is, the string can be balanced only if total number of brackets is even (there must be equal no of ‘{‘ and ‘}’)
 * A Naive Solution is to consider every bracket and recursively count number of reversals by taking two cases (i) keeping the bracket as it is (ii) reversing the bracket. If we get a balanced expression, we update result if number of steps followed for reaching here is smaller than the minimum so far.
 * <p>
 * Steps to implement
 * <p>
 * Check for the length of the given expression, if it is odd then return -1
 * If it is even then call a recursive function
 * That recursive function once leaves a bracket as it is and once reverses a bracket
 * After each recursive call, we will check whether the modified string is balanced or not
 * If the modified string is balanced and the number of reversals to reach this string is minimum from all the answers found till now then keep this answer stored somewhere
 * In the function for checking whether the string is balanced or not, we will initially keep count=0.
 * After that traverse the string and if we got ‘{‘ then increment the count else decrement the count
 * If at any point count becomes negative then this means there are more Closing brackets than opening ones. Hence string is not balanced
 * At last, if the count is not equal to 0 then that means there are more opening brackets than closing ones. Hence string is not balanced
 * If we never found that there are more Closing brackets than opening ones or there are more opening brackets than closing ones then the string is balanced
 */
class MinimumNumberOfBracketReversalsNeededToMakeAnExpressionBalanced {
    static int countMinReversals(String str) {
        // Step 1: Initialize a stack of char type and ans as 0.
        Stack<Character> st = new Stack<Character>();
        int ans = 0;

        // Step 2: Run a loop for each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Step 2.1: If ' { ' encountered push it to the
            // stack
            if (str.charAt(i) == '{')
                st.add(str.charAt(i));
                // Step 2.2: If ' } ' is encountered
            else {
                // Step 2.2.1: If stack has a '{' present for
                // '}' encountered, pop from the stack.
                if (!st.isEmpty())
                    st.pop();

                    // Step 2.2.2: If stack is empty, change '}' to
                    // '{' and push it to stack and increment ans by
                    // 1
                else {
                    st.add('{');
                    ans++;
                }
            }
        }
        // Step 3: if stack size is odd return -1.
        if (st.size() % 2 != 0)
            return -1;

        // Step 4: Increment ans by ( stackSize/2 ).
        ans += st.size() / 2;

        return ans;
    }

    // Driver code
    public static void main(String args[]) {
        String expr = "{{{{}}";
        System.out.println(countMinReversals(expr));
    }
}

// This code iscontributed by shinjanpatra.
