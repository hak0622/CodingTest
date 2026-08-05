import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character>st = new Stack<>();
        int count = 0;
        
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            
            while(!st.isEmpty() && st.peek() < c && count < k){
                st.pop();
                count++;
            }
            st.push(c);
        }
        
        for(int i=0; i<number.length()-k; i++){
            sb.append(st.get(i));
        }
        
        return sb.toString();
    }
}