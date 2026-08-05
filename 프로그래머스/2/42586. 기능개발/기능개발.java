import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer>list = new ArrayList<>();
        int[]days = new int[progresses.length];
        
        for(int i=0; i<days.length; i++){
            days[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int max = days[0];
        int count = 1;
        
        for(int i=1; i<days.length; i++){
            
            if(max >= days[i]){
                count++;
            }else{
                list.add(count);
                max = days[i];
                count = 1;
            }
        }
        
        list.add(count);
        return list.stream().mapToInt(i->i).toArray();
    }
}