import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>q = new LinkedList<>();
        
        int time = 0;
        int totalWeight = 0;
        int idx = 0;
        
        for(int i=0; i<bridge_length; i++){
            q.add(0);
        }
        
        while(idx < truck_weights.length || totalWeight > 0){
            time++;
            
            int truck = q.poll();
            totalWeight = totalWeight - truck;
            if(idx < truck_weights.length){
                if(totalWeight + truck_weights[idx] <= weight){
                    q.add(truck_weights[idx]);
                    totalWeight = totalWeight + truck_weights[idx];
                    idx++;
                }else{
                    q.add(0);
                }
            }else{
                q.add(0);
            }
        }
        return time;
    }
}