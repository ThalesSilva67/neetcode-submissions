class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        int result = 0;
        String chr = "";

        for (int i = 0; i < tokens.length; i++) {
            chr = tokens[i];
            if (!chr.equals("+") && !chr.equals("-") && !chr.equals("*") && !chr.equals("/")) {
                stack.push(chr);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (chr) {
                    case "+" -> result = a + b;
                    case "-" -> result = b - a;
                    case "*" -> result = a * b;
                    case "/" -> result = b / a;
                }

                stack.push(String.valueOf(result));
            }
        }

        result = Integer.parseInt(stack.pop());

        return result;
    }
}
