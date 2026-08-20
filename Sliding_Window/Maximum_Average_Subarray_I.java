/* Day 13
 * Problem: Maximum Average Subarray I
 * Platform: LeetCode
 * Topic: Sliding Window
 * Difficulty: Easy
 *
 * Approach:
 * - Calculate the sum of the first k elements.
 * - Store it as the maximum sum.
 * - Slide the window by removing the left element
 *   and adding the new right element.
 * - Update the maximum sum whenever a larger sum is found.
 * - Return maxSum / k.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}