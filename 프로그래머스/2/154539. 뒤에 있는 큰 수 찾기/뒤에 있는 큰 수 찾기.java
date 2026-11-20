import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[]arr = new int[numbers.length];
        Arrays.fill(arr,-1);
        
        Stack<Integer>st = new Stack<>();
        
        for(int i=0; i<numbers.length; i++){
            while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                int idx = st.pop();
                arr[idx] = numbers[i];
            }
            st.push(i);
        }
        return arr;
    }
}