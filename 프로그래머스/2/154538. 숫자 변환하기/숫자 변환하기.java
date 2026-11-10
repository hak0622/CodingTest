import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]>q = new LinkedList<>();
        boolean[]visited = new boolean[y+1];
        
        q.add(new int[]{x,0});
        visited[x] = true;
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            int num = cur[0];
            int count = cur[1];
            
            if(num == y) return count;
            
            int[]next = {num + n, num * 2, num * 3};
            
            for(int i=0; i<next.length; i++){
                int value = next[i];
                
                if(value <= y && !visited[value]){
                    visited[value] = true;
                    q.add(new int[]{value, count+1});
                }
            }
        }

        return -1;
    }
}