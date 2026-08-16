/*  Day 8 - Move Zeroes 
 
Approach 
- Use a pointer `index` to track the position where the next non-zero element should be placed. 
- Traverse the array and place all non-zero elements at the beginning. 
- After all non-zero elements are placed, fill the remaining positions with `0`. 
 
Time Complexity :- O(n) 
Space Complexity :- O(1) 
 
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
