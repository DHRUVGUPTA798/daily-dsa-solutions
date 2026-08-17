/* Day 11
 * Problem: Missing Number
 * Platform: LeetCode
 * Topic: Arrays
 * Difficulty: Easy
 *
 * Approach:
 * - Calculate the expected sum of numbers from 0 to n.
 * - Calculate the actual sum of all elements in the array.
 * - The difference between the expected sum and actual sum
 *   gives the missing number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Date: 17-08-2026
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}