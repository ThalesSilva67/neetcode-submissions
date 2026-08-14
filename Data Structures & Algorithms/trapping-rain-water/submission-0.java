class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int maxLeft = 0;
        int maxRight = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                maxLeft = (height[left] < maxLeft) ? maxLeft : height[left];
                water += maxLeft - height[left];
                left++;
            } else {
                maxRight = (height[right] < maxRight) ? maxRight : height[right];
                water += maxRight - height[right];
                right--;
            }
        }

        return water;
    }
}
