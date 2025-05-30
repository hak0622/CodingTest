import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        List<List<Integer>>graph = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            graph.add(i,new ArrayList<>());
        }
        for(int[]edge : wires){
            int a = edge[0]-1;
            int b = edge[1]-1;
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int[]edge : wires){
            int a = edge[0]-1;
            int b = edge[1]-1;
            
            graph.get(a).remove(Integer.valueOf(b));
            graph.get(b).remove(Integer.valueOf(a));
            
            int count = bfs(a,graph,n);
            int diff = Math.abs(count - (n - count));
            answer = Math.min(answer,diff);
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return answer;
    }
    public int bfs(int start,List<List<Integer>>graph,int n){
        boolean[]visited = new boolean[n];
        Queue<Integer>q = new LinkedList<>();
        q.add(start);
        visited[start]=true;
        int cnt = 1;
        
        while(!q.isEmpty()){
            int current = q.poll();
            for(int next : graph.get(current)){
                if(!visited[next]){
                    q.add(next);
                    visited[next]=true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}