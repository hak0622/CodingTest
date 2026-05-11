import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[]days = new int[progresses.length];
        
        for(int i=0; i<days.length; i++){
            if((100 - progresses[i]) % speeds[i] != 0) days[i] = (100 - progresses[i]) / speeds[i] + 1;
            else days[i] = (100 - progresses[i]) / speeds[i];
        }
        
        List<Integer>list = new ArrayList<>();
        int day = days[0];
        int count = 1;
        
        for(int i=1; i<days.length; i++){
            if(days[i] <= day) {
                count++;
            }
            else{
                list.add(count);
                count = 1;
                day = days[i];
            }
        }
        list.add(count);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}