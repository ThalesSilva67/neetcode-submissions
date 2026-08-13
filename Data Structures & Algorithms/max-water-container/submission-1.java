class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;
        int maxArea = 0;

        while(left < right) {
            max = (right - left) * Math.min(heights[left], heights[right]);
            if(maxArea < max) {
                maxArea = max;
            }
            
            if(heights[left] < heights[right]) {
                left++;
            } else if(heights[left] == heights[right]) {
                left++;
                right--;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
