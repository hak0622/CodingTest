import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if(x == y) return 0;
        
        int[]dist = new int[y+1];
        Queue<Integer>q = new LinkedList<>();
        q.add(x);
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            int[]nextValues = {cur + n,cur * 2, cur * 3};
            
            for(int next : nextValues){
                if(next == y) return dist[cur] + 1;
                
                if(next < y && dist[next] == 0){
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
        return -1;
    }
}