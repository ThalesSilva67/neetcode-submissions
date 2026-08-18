class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alfabeto = new int[26];
        int[] count = new int[26];
        int left = 0;
        int right = 0;
        boolean permutation = false;

        for (int i = 0; i < s1.length(); i++) {
            alfabeto[s1.charAt(i) - 'a']++;
        }

        while (right < s2.length()) {
            count[s2.charAt(right) - 'a']++;

            if (right - left + 1 == s1.length()) {
                if (Arrays.equals(alfabeto, count)) {
                    permutation = true;
                } else {
                    count[s2.charAt(left) - 'a']--;
                    left++;
                }
            }

            right++;
        }

        return permutation;
    }
}
