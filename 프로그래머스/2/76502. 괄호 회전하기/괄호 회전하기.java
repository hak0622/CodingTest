import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String doubleS = s+s;
        for(int i=0; i<s.length(); i++){
            if(isValid(doubleS.substring(i,i+s.length()))){
                answer++;
            }
        }
        return answer;
    }
    boolean isValid(String s){
        Stack<Character>st = new Stack<>();
        for(char current : s.toCharArray()){
            if(current == '('|| current=='{'||current=='['){
                st.push(current);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char target = st.pop();
                if(target == '(' && current != ')'||
                   target == '{' && current != '}'||
                   target == '[' && current != ']'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}