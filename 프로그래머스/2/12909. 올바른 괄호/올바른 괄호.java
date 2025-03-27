import java.util.*;  

class Solution {
    boolean solution(String s) {
        boolean answer=true;

         Stack<Character> stackCh = new Stack<>();
         for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stackCh.push('(');
            }else if(s.charAt(i)==')'){
                if(stackCh.isEmpty()){
                    answer = false;
                    break;
                }
                stackCh.pop();
            }
         }
        if (!stackCh.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}