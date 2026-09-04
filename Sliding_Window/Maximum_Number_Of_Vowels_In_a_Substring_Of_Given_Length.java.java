/* Day XX
 * Problem: Maximum Number of Vowels in a Substring of Given Length
 * Platform: LeetCode (#1456)
 * Topic: Sliding Window
 * Difficulty: Medium
 *
 * Solution:
 * - Maintain a sliding window of size k.
 * - Count vowels present in the current window.
 * - Expand the window by adding s[right].
 * - If the current character is a vowel, increase count.
 * - If window size exceeds k:
 *      - Remove s[left].
 *      - If removed character is a vowel,
 *        decrease count.
 *      - Move left forward.
 * - When window size becomes exactly k:
 *      - Update the maximum vowel count.
 * - Return the maximum count found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {

        int left = 0;
        int vowels = 0;
        int maxVowels = 0;

        for (int right = 0; right < s.length(); right++) {

            if (isVowel(s.charAt(right))) {
                vowels++;
            }

            if (right - left + 1 > k) {

                if (isVowel(s.charAt(left))) {
                    vowels--;
                }

                left++;
            }

            if (right - left + 1 == k) {
                maxVowels = Math.max(maxVowels, vowels);
            }
        }

        return maxVowels;
    }
}