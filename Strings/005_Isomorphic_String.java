/*
 * Day 16
 * Problem: Isomorphic Strings
 * Platform: LeetCode 205
 * Topic: Strings, HashMap
 * Difficulty: Easy
 *
 * Approach:
 * - Maintain mappings from s -> t and t -> s.
 * - If a character is already mapped, verify consistency.
 * - If not mapped, create a new mapping in both directions.
 * - If any mismatch occurs, return false.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                mapST.put(c1, c2);
            }

            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}