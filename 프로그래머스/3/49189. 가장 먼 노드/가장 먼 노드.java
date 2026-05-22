import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>>graph = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[]e : edge){
            int a = e[0];
            int b = e[1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        Queue<Integer>q = new LinkedList<>();
        boolean[]visited = new boolean[n+1];
        int[]dist = new int[n+1];
        
        q.add(1);
        visited[1] = true;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int next : graph.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[cur] + 1;
                    q.add(next);
                }
            }
        }
        
        int max = 0;
        for(int i=0; i<=n; i++){
            max = Math.max(max,dist[i]);
        }
        int count = 0;
        for(int i=0; i<=n; i++){
            if(max == dist[i]) count++;
        }
        
        return count;
    }
}