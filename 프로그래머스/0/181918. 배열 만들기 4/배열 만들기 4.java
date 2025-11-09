import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        
        while(i < arr.length){
            if(st.isEmpty()){
                st.push(arr[i]);
                i++;
            }else if(st.peek() < arr[i]){
                st.push(arr[i]);
                i++;
            }else{
                st.pop();
            }
        }
        
        int[]stk = new int[st.size()];
        
        for(int j=0; j < st.size(); j++){
            stk[j] = st.get(j);
        }
        
        return stk;
    }
}