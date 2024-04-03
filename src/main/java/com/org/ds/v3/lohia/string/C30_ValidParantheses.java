package com.org.ds.v3.lohia.string;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/solutions/1602365/20-valid-parentheses/
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 * Solution::
 * https://www.youtube.com/watch?v=TaWs8tIrnoA&list=PLFdAYMIVJQHNZy3Q4MnLnCBZ9-OxOhaWY&index=30
 * Using stack DS
 */

//TC: O(n/2) SC: O(n)

class C30_ValidParantheses {

  boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {

      if (c == '(')
        stack.push(')');
       else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');

      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();

  }

}