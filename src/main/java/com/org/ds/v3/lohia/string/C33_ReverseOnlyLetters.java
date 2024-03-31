package com.org.ds.v3.lohia.string;

/**
 * https://leetcode.com/problems/reverse-only-letters/solutions/179679/917-reverse-only-letters/
 *
 * Given a string s, reverse the string according to the following rules:
 *
 * All the characters that are not English letters remain in the same position.
 * All the English letters (lowercase or uppercase) should be reversed.
 * Return s after reversing it.
 *
 * Example 1:
 *
 * Input: s = “ab-cd”
 *
 * Output: “dc-ba”
 *
 * Example 2:
 *
 * Input: s = “a-bC-dEf-ghIj”
 *
 * Output: “j-Ih-gfE-dCba”
 *
 * Example 3:
 *
 * Input: s = “Test1ng-Leet=code-Q!”
 *
 * Output: “Qedo1ct-eeLg=ntse-T!”
 *
 * Constraints:
 *
 * 1 <= s.length <= 100
 * s consists of characters with ASCII values in the range [33, 122].
 * s does not contain '\"' or '\\'.
 *
 * https://www.youtube.com/watch?v=0gOUxVKFv74
 */
public class C33_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int start = 0, end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetter(ch[start])) {
                start++;
            } else if (!Character.isLetter(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
