package com.org.ds.v1.string.medium;

/**
 * Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.
 * <p>
 * Examples:
 * <p>
 * Input  : str1 = "3333311111111111",
 * str2 =   "44422222221111"
 * Output : 3377733333332222
 * <p>
 * Input  : str1 = "7777555511111111",
 * str2 =    "3332222221111"
 * Output : 7780887733332222
 * Approach 3 : Optimization
 * We can avoid the first two string reverse operations by traversing them from the end. Below is the optimized solution.
 */
public class SumOfTwoLargeNumbers {
    static String findSum(String str1, String str2) {
        // Before proceeding further, make sure length
        // of str2 is larger.
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        // Calculate length of both String
        int n1 = str1.length(), n2 = str2.length();
        int diff = n2 - n1;

        // Initially take carry zero
        int carry = 0;

        // Traverse from end of both Strings
        for (int i = n1 - 1; i >= 0; i--) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((str1.charAt(i) - '0') +
                    (str2.charAt(i + diff) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining digits of str2[]
        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ((str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str += (char) (carry + '0');

        // reverse resultant String
        return new StringBuilder(str).reverse().toString();
    }

    // Driver code
    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";
        System.out.println(findSum(str1, str2));
    }
}

/**
 * Output:
 * <p>
 * 198123
 * Time Complexity: O(max(n1, n2)) where n1 and n2 are lengths of two input strings representing numbers.
 * <p>
 * Auxiliary Space: O(max(n1, n2))
 */
