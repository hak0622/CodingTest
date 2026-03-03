import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character>st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(st.isEmpty() && c == ')'){
                return false;
            }
            
            if(c == '('){
                st.push(c);
            }else{
                st.pop();
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }
        
        return answer;
    }
}