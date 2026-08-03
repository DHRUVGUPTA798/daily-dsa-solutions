/*
 * Problem: Two Sum
 * Platform: LeetCode
 * Topic: Arrays, HashMap
 * Difficulty: Easy
 *
 * Approach:
 * - Use HashMap to store visited numbers and their indices.
 * - For each element, check if its complement exists in the map.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * Date: 03-08-2026
 */

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}