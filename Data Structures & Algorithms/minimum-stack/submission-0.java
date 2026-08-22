class MinStack {
    int[] arr;
    int[] minItems;
    int size = 0;

    public MinStack() {
        this.arr = new int[10000];
        this.minItems = new int[arr.length];
    }

    public void push(int val) {
        if (size == arr.length) {
            throw new RuntimeException("Stack is full");
        }
        this.arr[size] = val;
        if (size == 0) {
            this.minItems[size] = val;
        } else {
            this.minItems[size] = Math.min(val, minItems[size - 1]);
        }
        size++;
    }

    public void pop() {
        if (this.size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        size--;
    }

    public int top() {
        if (size == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return this.arr[size - 1];
    }

    public int getMin() {
        return this.minItems[size - 1];
    }
}
