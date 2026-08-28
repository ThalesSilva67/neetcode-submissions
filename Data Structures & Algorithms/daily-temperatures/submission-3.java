class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idxTop = stack.pop();
                int temp = i - idxTop;
                result[idxTop] = temp;
            }
            stack.push(i);
        }

        return result;
    }
}
