import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character>st = new Stack<>();
        
        for(int i=0; i<number.length(); i++){
            char num = number.charAt(i);
            
            while(!st.isEmpty() && k > 0 && st.peek() < num){
                st.pop();
                k--;
            }
            st.push(num);
        }
        
        while(k > 0){
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<st.size(); i++){
            sb.append(st.get(i));
        }
        
        return sb.toString();
    }
}