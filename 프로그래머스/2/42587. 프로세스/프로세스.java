import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]>q = new LinkedList<>();
        int answer = 0;
        
        for(int i=0; i<priorities.length; i++){
            q.add(new int[]{priorities[i],i});
        }
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            boolean high = false;
            
            for(int[]p : q){
                if(p[0] > cur[0]){
                    high = true;
                    break;
                }
            }
            if(high){
                q.add(cur);
            }else{
                answer++;
                if(cur[1] == location) return answer;
            }
        }
        return answer;
    }
}