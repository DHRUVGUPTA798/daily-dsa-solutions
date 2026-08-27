/* Day 17
 * Problem: Longest Substring Without Repeating Characters
 * Platform: LeetCode
 * Topic: Strings, Sliding Window
 * Difficulty: Medium
 *
 * Approach:
 * - Use a sliding window with two pointers (left and right).
 * - Store the latest index of each character in a HashMap.
 * - If a character repeats within the current window,
 *   move the left pointer to one position after its previous occurrence.
 * - Update the maximum length after processing each character.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar) &&
                map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}