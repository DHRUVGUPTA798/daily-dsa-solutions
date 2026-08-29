/* 
 * Day 19
 * Problem: Valid Anagram
 * Platform: LeetCode 242
 * Topic: Strings, Hashing
 * Difficulty: Easy
 * 
 * Approach:
 * - If lengths are different, return false.
 * - Use a frequency array of size 26.
 * - Increment count for characters in first string.
 * - Decrement count for characters in second string.
 * - If any frequency is non-zero, strings are not anagrams.
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

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}