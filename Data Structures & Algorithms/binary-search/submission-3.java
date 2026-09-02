class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int hi = nums.length;

        while(low < hi) {
            int mid = low + (hi - low) / 2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                hi = mid; 
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
