import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String doubleS = s + s;
        
        for(int i=0; i<s.length(); i++){
            if(isValid(doubleS.substring(i,i+s.length()))){
                answer++;
            }
        }
        return answer;
    }
    boolean isValid(String s){
        Stack<Character>st = new Stack<>();
        
        for(char cur :s.toCharArray()){
            if(cur=='('|| cur=='{'||cur=='['){
                st.push(cur);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char target = st.pop();
                if((target == '('&&cur != ')')||
                   (target == '('&&cur != ')')||
                   (target == '('&&cur != ')')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}