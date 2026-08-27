class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayDeque<Double> stack = new ArrayDeque<>();
        double[][] cars = new double[position.length][2];

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));

        for (int i = cars.length - 1; i >= 0; i--) {
            double temp = cars[i][1];

            if (stack.isEmpty() || temp > stack.peek()) {
                stack.push(temp);
            }
        }

        return stack.size();
    }
}
