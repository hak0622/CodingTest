import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character>st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(st.isEmpty() && c == ')'){
                return false;
            }
            
            if(st.isEmpty() || c == '('){
                st.push(c);
            }
            
            if(!st.isEmpty() && c == ')'){
                st.pop();
            }
        }
        

        return st.isEmpty() ? true : false;
    }
}