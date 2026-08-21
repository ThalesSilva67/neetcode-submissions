class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if ((temp == ')' && top != '(') || (temp == '}' && top != '{')
                        || (temp == ']' && top != '['))
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
