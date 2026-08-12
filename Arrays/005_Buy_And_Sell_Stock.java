/*
 * Day:5
 * Problem: Best Time to Buy and Sell Stock
 * Platform: LeetCode
 * Topic: Array, Greedy
 * Difficulty: Easy
 *
 * Approach:
 * - Keep track of the minimum price seen so far.
 * - For each price, calculate the profit if sold today.
 * - Update the maximum profit whenever a better profit is found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}