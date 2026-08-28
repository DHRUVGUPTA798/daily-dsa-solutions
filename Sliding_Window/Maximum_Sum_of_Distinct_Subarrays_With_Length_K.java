/* Day 17
 * Problem: Maximum Sum of Distinct Subarrays With Length K
 * Platform: LeetCode
 * Topic: Sliding Window, HashMap
 * Difficulty: Medium
 *
 * Approach:
 * - Use a sliding window of size k.
 * - Maintain the sum of elements inside the current window.
 * - Use a HashMap to track the frequency of each element.
 * - Expand the window by adding the current element.
 * - If the window size exceeds k, remove the leftmost element.
 * - When the window size becomes exactly k:
 *      - Check if all elements are distinct
 *        (map size == k).
 *      - If yes, update the maximum sum.
 * - Return the maximum sum found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(k)
 */

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        long windowSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            windowSum += nums[right];
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 > k) {
                windowSum -= nums[left];

                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }

                left++;
            }

            if (right - left + 1 == k && freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}