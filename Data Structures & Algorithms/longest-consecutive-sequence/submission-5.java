class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setNums =
            new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
        int begin = 0;
        int record = 0;
        int i = 0;

        for (Integer num : setNums) {
            if (!setNums.contains(num - 1)) {
                begin = num;
                i++;

                while (setNums.contains(begin + i)) {
                    i++;
                }

                if (record < i) {
                    record
                    = i;
                }
            }
            i = 0;
        }
        return record;
    }
}
