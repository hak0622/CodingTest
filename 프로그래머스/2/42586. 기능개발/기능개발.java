import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer>list = new ArrayList<>();
        int day = 0;
        Stack<Integer>st = new Stack<>();
        
        for(int i=0; i<progresses.length; i++){
            int count = 0;
            
            if((100 - progresses[i]) % speeds[i] == 0){
                day = (100 - progresses[i]) / speeds[i];
            }else{
                day = (100 - progresses[i]) / speeds[i] + 1;
            }
            
            if(st.isEmpty() || st.peek() < day){
                st.push(day);
                list.add(1);
            }else{
                int index = list.size()-1;
                list.set(index,list.get(index)+1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}