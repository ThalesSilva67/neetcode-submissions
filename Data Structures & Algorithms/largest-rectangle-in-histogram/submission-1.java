class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] n = heights;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i < n.length; i++) {
            while (!stack.isEmpty() && n[i] < n[stack.peek()]) {
                int h = n[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, width * h);
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int h = n[stack.pop()];
            int width = stack.isEmpty() ? n.length : n.length - stack.peek() - 1;

            maxArea = Math.max(maxArea, width * h);
        }

        return maxArea;
    }
}
