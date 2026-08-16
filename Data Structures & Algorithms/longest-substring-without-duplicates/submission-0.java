class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ascii = new int[128];
        Arrays.fill(ascii, -1);

        int left = 0;
        int right = 0;
        int windowSum = 0;
        int maxLen = 0;

        while (right < s.length()) {
            if (ascii[s.charAt(right)] >= left) {
                left = ascii[s.charAt(right)] + 1;
            }

            windowSum = right - left + 1;

            if (maxLen < windowSum) {
                maxLen = windowSum;
            }

            ascii[s.charAt(right)] = right;
            right++;
        }

        return maxLen;
    }
}
