import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[]namugi = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
            namugi[i] = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }
        
        List<Integer>list = new ArrayList<>();
        
        int day = namugi[0];
        int count = 1;
        
        for(int i=1; i<namugi.length; i++){
            if(namugi[i] <= day){
                count++;
            }else{
                list.add(count);
                count = 1;
                day = namugi[i];
            }
        }
        list.add(count);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


