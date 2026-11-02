import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int n = s.length();
        
        
        for(int i=0; i<n; i++){
            Stack<Character>st = new Stack<>();
            boolean valid = true;
            
            for(int j=0; j<n; j++){
                char c = s.charAt((i+j) % n);
                
                if(st.isEmpty() && (c == ']' || c == ')' || c == '}')){
                    valid = false;
                    break;
                }
                
                if(!st.isEmpty() && ((st.peek() == '[' && c == ']') || (st.peek() == '{' && c == '}') || (st.peek() == '(' && c == ')'))){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
            if(valid && st.isEmpty()) answer++;
        }
        return answer;
    }
}