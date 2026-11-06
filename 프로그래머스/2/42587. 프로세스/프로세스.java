import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]>q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            q.add(new int[]{i,priorities[i]});
        }
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            boolean high = false;
            
            for(int[]p : q){
                if(cur[1] < p[1]){
                    high = true;
                    break;
                }
            }
            
            if(high){
                q.add(cur);
            }else{
                answer++;
                
                if(cur[0] == location) return answer;
            }
        }
        
        return answer;
    }
}