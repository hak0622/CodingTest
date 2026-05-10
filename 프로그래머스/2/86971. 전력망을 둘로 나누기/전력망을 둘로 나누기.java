import java.util.*;

class Solution {
    boolean[]visited;
    List<List<Integer>>graph = new ArrayList<>();
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[]w : wires){
            int a = w[0];
            int b = w[1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for(int[]w : wires){
            int v1 = w[0];
            int v2 = w[1];
            
            visited = new boolean[n + 1];
            
            int count = dfs(v1,v2);
            int diff = Math.abs(count - (n - count));
            answer= Math.min(answer, diff);
        }
        return answer;
    }
    
    public int dfs(int curr, int block){
        visited[curr] = true;
        int count = 1;
        
        for(int next : graph.get(curr)){
            if(!visited[next] && next != block){
                count = count + dfs(next, block);
            }
        }
        return count;
    }
}