 /* Day 3
 * Problem: Longest Common Prefix
 * Platform: LeetCode
 * Topic: Strings
 * Difficulty: Easy
 *
 * Approach:
 * - Assume the first string is the prefix.
 * - Compare it with every other string.
 * - While the current string does not start with the prefix,
 *   remove the last character from the prefix.
 * - Continue until a common prefix is found.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
