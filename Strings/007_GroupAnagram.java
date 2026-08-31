/*
 * Day 20
 * Problem: Group Anagrams
 * Platform: LeetCode 49
 * Topic: Strings, HashMap
 * Difficulty: Medium
 *
 * Approach:
 * - Sort each string.
 * - Use sorted string as key in HashMap.
 * - Store all original strings having same sorted form.
 * - Return all grouped values.
 *
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n * k)
 */

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}