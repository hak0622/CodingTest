import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[]answer = new int[prices.length];
        Stack<Integer>st = new Stack<>();
        
        for(int i=0; i<prices.length; i++){
            while(!st.isEmpty() && prices[st.peek()] > prices[i]){
                int popIndex = st.pop();
                answer[popIndex] = i - popIndex;
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int popIndex = st.pop();
            answer[popIndex] = (prices.length - 1) - popIndex;
        }
        return answer;
    }
}