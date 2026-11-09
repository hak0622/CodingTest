import java.util.*;

class Solution {
    public int solution(int[] order) {
        int[]arr = new int[order.length];
        Stack<Integer>st = new Stack<>();
        int idx = 0;
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        
        for(int i=0; i<order.length; i++){
            if(arr[i] == order[idx]){
                answer++;
                idx++;
            }else{
                st.push(arr[i]);
            }
            
            while(idx < order.length && !st.isEmpty() && st.peek() == order[idx]){
                st.pop();
                answer++;
                idx++;
            }
            
            if(idx == order.length) return answer;
            
            if(order[idx] <= arr[i]) break;
        }
        
        return answer;
        
    }
}