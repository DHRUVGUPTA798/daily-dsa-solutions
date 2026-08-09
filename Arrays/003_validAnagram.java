/* Day 3
 * Problem: Valid Anagram
 * Platform: LeetCode
 * Topic: String, HashMap
 * Difficulty: Easy
 *
 * Approach:
 * - If lengths are different, return false.
 * - Count frequency of each character in the first string.
 * - Decrease frequency while traversing the second string.
 * - If any frequency becomes negative, strings are not anagrams.
 * - If all frequencies match, return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}