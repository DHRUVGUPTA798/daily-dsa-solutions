/* Day 26
 * Problem: Longest Substring Without Repeating Characters
 * Platform: LeetCode
 * Topic: Strings, Sliding Window
 * Difficulty: Medium
 *
 * Approach:
 * - Use a sliding window with two pointers (left and right).
 * - Maintain frequency of characters inside the current window.
 * - Expand the window by moving the right pointer.
 * - If a duplicate character appears, shrink the window
 *   from the left until all characters are unique again.
 * - Update the maximum window length at each step.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)  // ASCII character set
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;

            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}