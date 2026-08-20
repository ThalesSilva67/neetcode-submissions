class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxWindow = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            while (!deque.isEmpty() && nums[right] > nums[deque.getLast()]) {
                deque.removeLast();
            }

            deque.addLast(right);

            if (deque.getFirst() < left) {
                deque.removeFirst();
            }

            if (right >= k - 1) {
                maxWindow[left] = nums[deque.getFirst()];
                left++;
            }

            right++;
        }

        return maxWindow;
    }
}
