import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<List<Integer>>graph = new ArrayList<>();
        Queue<Integer>q = new LinkedList<>();
        int[]dist = new int[n+1];
        boolean[]visited = new boolean[n+1];
        int answer = 0;
        
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[]e : edge){
            int a = e[0];
            int b = e[1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
    
        q.add(1);
        visited[1] = true;
        dist[1] = 1;
        
        while(!q.isEmpty()){
            int cur = q.poll();
            
            for(int next : graph.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                    dist[next] = dist[cur] + 1;
                }
            }
        }
        
        int max = 0;
        
        for(int i=1; i<=n; i++){
            max = Math.max(max,dist[i]);
        }
        
        for(int i=1; i<=n; i++){
            if(max == dist[i]) answer++;
        }
        
        return answer;
    }
}