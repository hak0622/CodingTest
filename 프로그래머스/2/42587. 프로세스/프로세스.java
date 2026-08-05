import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            q.add(new int[]{priorities[i],i});
            pq.add(priorities[i]);
        }
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            if(cur[0] == pq.peek()){
                pq.poll();
                answer++;
                
                if(cur[1] == location){
                    return answer;
                }
            }else{
                q.add(cur);
            }
        }
        return answer;
    }
}