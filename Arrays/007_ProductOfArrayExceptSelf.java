/*
 * Problem: Product of Array Except Self
 * Platform: LeetCode
 * Topic: Array, Prefix Sum
 * Difficulty: Medium
 *
 * Approach:
 * - Create an answer array.
 * - First pass: store product of all elements to the left.
 * - Second pass: multiply by product of all elements to the right.
 * - No division is used.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding output array)
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}