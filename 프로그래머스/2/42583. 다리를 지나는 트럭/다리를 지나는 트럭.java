import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>q = new LinkedList<>();
        int time = 0;
        int now_weight = 0;
        int truck_idx = 0;
        
        for(int i=0; i<bridge_length; i++){
            q.add(0);
        }
        
        while(truck_idx < truck_weights.length){
            time++;
            
            now_weight = now_weight - q.poll();
            
            int next_truck = truck_weights[truck_idx];
            
            if(now_weight + next_truck <= weight){
                q.add(next_truck);
                now_weight = now_weight + next_truck;
                truck_idx++;
            }else{
                q.add(0);
            }
        }
        return time + bridge_length;
    }
}