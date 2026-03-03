import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer>st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()){
                st.push(arr[i]);
                continue;
            }
            
            if(!st.isEmpty() && st.peek() == arr[i]){
                continue;
            }
            st.push(arr[i]);
        }

        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}