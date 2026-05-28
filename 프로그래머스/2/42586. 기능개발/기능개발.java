import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[]days = new int[speeds.length];
        List<Integer>list = new ArrayList<>();
        
        for(int i=0; i<days.length; i++){
            days[i] = (int)Math.ceil((100.0 - progresses[i])/speeds[i]);
        }
        
        int max = days[0];
        int count = 1;
        
        for(int i=1; i<days.length; i++){
            if(days[i] <= max){
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