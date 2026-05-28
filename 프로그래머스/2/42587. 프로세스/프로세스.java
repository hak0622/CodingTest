import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>q = new LinkedList<>();
        int answer = 0;
        
        for(int i=0; i<priorities.length; i++){
            q.add(new int[]{i,priorities[i]});
            pq.add(priorities[i]);
        }
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            if(cur[1] == pq.peek()){
                pq.poll();
                answer++;
                
                if(cur[0] == location){
                    return answer;
                }
            }else{
                q.add(cur);
            }
        }
        return answer;
    }
}