import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Stack<Integer>st = new Stack<>();
        st.push(0);
        
        for(int i=1; i<numbers.length; i++){
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                int idx = st.pop();
                answer[idx] = numbers[i];
            }
            st.push(i);
        }
        
        return answer;
    }
}