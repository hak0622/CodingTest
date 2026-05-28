import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>bridge = new LinkedList<>();
        int time = 0;
        int cur_weight = 0;
        int truck_idx = 0;
        
        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        
        while(truck_idx < truck_weights.length){
            time++;
            
            cur_weight = cur_weight - bridge.poll();
            
            int next_truck = truck_weights[truck_idx];
            
            if(cur_weight + next_truck <= weight){
                bridge.add(next_truck);
                cur_weight = cur_weight + next_truck;
                truck_idx++;
            }else{
                bridge.add(0);
            }
        }
        return time + bridge_length;
    }
}