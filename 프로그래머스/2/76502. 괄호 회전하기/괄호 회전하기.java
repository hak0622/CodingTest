import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (isValid(s, i, len)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isValid(String s, int start, int len) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            char c = s.charAt((start + i) % len);
            
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.peek();
                if ((c == ']' && top == '[') || 
                    (c == '}' && top == '{') || 
                    (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}