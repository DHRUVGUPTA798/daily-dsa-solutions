/*
 * Day 21
 * Problem: First Unique Character in a String
 * Platform: LeetCode 387
 * Topic: Strings, Hashing
 * Difficulty: Easy
 *
 * Approach:
 * - Count frequency of each character.
 * - Traverse string again.
 * - Return index of first character with frequency 1.
 * - If none exists, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}