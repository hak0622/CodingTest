import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer>st = new Stack<>();
        int i=0;
        
        while(i < arr.length){
            if(st.isEmpty()){
                st.push(arr[i]);
            }else if(!st.isEmpty() && st.peek() == arr[i]){
                st.pop();
            }else{
                st.push(arr[i]);
            }
            i++;
        }
        
        if(st.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int[st.size()];
        for(int j=0; j<st.size(); j++){
            answer[j] = st.get(j);
        }
        return answer;
    }
}