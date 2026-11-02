import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer>list = new ArrayList<>();
        Stack<Integer>st = new Stack<>();
        
        int first = (int)Math.ceil((double)(100 - progresses[0]) /speeds[0]);
        st.push(first);
        int idx = 1;
        
        for(int i=1; i<progresses.length; i++){
            int day = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            
            if(st.peek() < day){
                list.add(idx);
                st.pop();
                st.push(day);
                idx = 1;
            }else{
                idx++;
            }
        }
        
        list.add(idx);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}