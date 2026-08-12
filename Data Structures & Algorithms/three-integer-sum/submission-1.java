class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> withoutDuplicates = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int high = nums.length - 1;
            int low = i + 1;

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            while (low < high) {
                int sum = nums[high] + nums[low];

                if (sum == -nums[i]) {

                    withoutDuplicates.add(Arrays.asList(nums[low], nums[high], nums[i]));
                    low++;
                    high--;

                } else if (sum > -nums[i]) {
                    high--;
                } else {
                    low++;
                }

            }
        }

        List<List<Integer>> matriz = new ArrayList<>(Set.copyOf(withoutDuplicates));

        return matriz;
    }
}
