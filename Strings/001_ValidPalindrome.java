/* Day 12
 * Problem: Valid Palindrome
 * Platform: LeetCode
 * Topic: Strings
 * Difficulty: Easy
 *
 * Approach:
 * - Use two pointers: one at the beginning and one at the end.
 * - Skip all non-alphanumeric characters.
 * - Compare characters in lowercase form.
 * - If any pair does not match, return false.
 * - If all pairs match, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}