import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[]days = new int[speeds.length];
        
        for(int i=0; i<days.length; i++){
            days[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        List<Integer>answer = new ArrayList<>();
        int maxDay = days[0];
        int count = 1;
        
        for(int i=1; i<days.length; i++){
            if(days[i] <= maxDay){
                count++;
            }else{
                answer.add(count);
                maxDay = days[i];
                count = 1;
            }
        }
        answer.add(count);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}