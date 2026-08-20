/* Day 13
 * Problem: Reverse String
 * Platform: LeetCode
 * Topic: Strings
 * Difficulty: Easy
 *
 * Approach:
 * - Use two pointers: one at the beginning and one at the end.
 * - Swap the characters at both pointers.
 * - Move the pointers towards the center.
 * - Continue until the pointers meet.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}