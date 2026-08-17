class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int left = 0;
        int right = 0;
        int maxFrequency = 0;
        int charReplace = 0;
        int maxLen = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;

            maxFrequency = Math.max(maxFrequency, count[s.charAt(right) - 'A']);
            charReplace = (right - left + 1) - maxFrequency;

            if (charReplace <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            right++;
        }

        return maxLen;
    }
}