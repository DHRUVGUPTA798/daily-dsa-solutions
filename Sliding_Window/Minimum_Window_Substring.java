import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Count frequencies of characters in t
        Map<Character, Integer> targetCounts = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        int required = targetCounts.size();
        int left = 0, right = 0;
        int formed = 0;

        // Keep track of character counts in the current window
        Map<Character, Integer> windowCounts = new HashMap<>();

        // Keep track of the minimum window [length, left_index, right_index]
        int[] minWindowMetrics = {-1, 0, 0}; 

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);

            // If the character count matches the required frequency in t
            if (targetCounts.containsKey(c) && windowCounts.get(c).equals(targetCounts.get(c))) {
                formed++;
            }

            // Try and contract the window till the point it ceases to be 'desirable'
            while (left <= right && formed == required) {
                c = s.charAt(left);

                // Update our smallest window tracking
                int currentWindowLength = right - left + 1;
                if (minWindowMetrics[0] == -1 || currentWindowLength < minWindowMetrics[0]) {
                    minWindowMetrics[0] = currentWindowLength;
                    minWindowMetrics[1] = left;
                    minWindowMetrics[2] = right;
                }

                // The character at the position pointed by the 'left' pointer is no longer a part of the window
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (targetCounts.containsKey(c) && windowCounts.get(c) < targetCounts.get(c)) {
                    formed--;
                }

                // Move the left pointer ahead to look for a smaller window
                left++;
            }

            // Move the right pointer ahead to expand the window
            right++;
        }

        return minWindowMetrics[0] == -1 ? "" : s.substring(minWindowMetrics[1], minWindowMetrics[2] + 1);
    }
}