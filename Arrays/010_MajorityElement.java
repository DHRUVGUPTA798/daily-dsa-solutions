/* Day 10
 * Problem: Majority Element
 * Platform: LeetCode
 * Topic: Arrays
 * Difficulty: Easy
 *
 * Approach:
 * - Use Boyer-Moore Voting Algorithm.
 * - Maintain a candidate and a count.
 * - If count becomes 0, choose the current element as the new candidate.
 * - Increment count if the current element matches the candidate,
 *   otherwise decrement it.
 * - The final candidate will be the majority element.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Date: 16-08-2026
 */
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}