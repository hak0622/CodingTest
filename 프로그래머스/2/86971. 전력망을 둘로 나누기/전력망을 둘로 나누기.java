import java.util.*; 

class Solution {
    public int solution(int n, int[][] wires) {
        List<List<Integer>>graph = new ArrayList<>();
        int answer = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            graph.add(i,new ArrayList<>());
        }
        for(int[]edge : wires){
            int a = edge[0] - 1;
            int b = edge[1] - 1;
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int[]edge : wires){
            int a = edge[0] - 1;
            int b = edge[1] - 1;
            
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
    public int bfs(int startVertex,List<List<Integer>>graph,int n){
        boolean[]visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(startVertex);
        visited[startVertex] = true;
        int count = 1;
        
        while(!q.isEmpty()){
            int curVertex = q.poll();
            for(int nextVertex : graph.get(curVertex)){
                if(!visited[nextVertex]){
                    q.add(nextVertex);
                    visited[nextVertex] = true;
                    count++;
                }
            }
        }
        return count;
    }
}