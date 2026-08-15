/*  Day 8 - Longest Consecutive Sequence

Topic :- Array + Hashing

Approach
- Store all elements of the array in a HashSet for O(1) lookup.
- A number is the start of a sequence if (num - 1) is not present in the set.
- From each starting number, keep checking the next consecutive numbers.
- Track the maximum sequence length found.

Time Complexity :- O(n)
Space Complexity :- O(n)

*/

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}