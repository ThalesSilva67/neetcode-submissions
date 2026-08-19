class Solution {
    public String minWindow(String s, String t) {
        int[] countT = new int[52];
        int[] count = new int[52];

        int left = 0;
        int right = 0;
        int countProgress = 0;
        int meta = 0;
        int minLen = Integer.MAX_VALUE;
        String str = "";

        for (int i = 0; i < t.length(); i++) {
            char charT = t.charAt(i);
            int idx;
            if (Character.isLowerCase(charT)) {
                idx = charT - 'a';
            } else {
                idx = charT - 'A' + 26;
            }

            countT[idx]++;

            if (countT[idx] == 1) {
                meta++;
            }
        }

        while (right < s.length()) {
            char chx = s.charAt(right);
            int idx;
            if (Character.isLowerCase(chx)) {
                idx = chx - 'a';
            } else {
                idx = chx - 'A' + 26;
            }

            count[idx]++;

            if (countT[idx] > 0 && count[idx] == countT[idx]) {
                countProgress++;
            }

            while (countProgress == meta) {
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    str = s.substring(left, right + 1);
                }

                char chxL = s.charAt(left);
                int idxL;
                if (Character.isLowerCase(chxL)) {
                    idxL = chxL - 'a';
                } else {
                    idxL = chxL - 'A' + 26;
                }

                count[idxL]--;

                if (countT[idxL] > 0 && count[idxL] < countT[idxL]) {
                    countProgress--;
                }

                left++;
            }

            right++;
        }

        return str;
    }
}
