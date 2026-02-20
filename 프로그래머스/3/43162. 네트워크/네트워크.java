class Solution {
    public int solution(int n, int[][] computers) {
        boolean[]visited = new boolean[n];
        int count = 0;
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                dfs(i,computers,visited,n);
            }
        }
        
        return count;
    }
    
    void dfs(int node, int[][]computers,boolean[]visited,int n){
        visited[node] = true;
        
        for(int next=0; next<n; next++){
            if(computers[node][next] == 1 && !visited[next]){
                dfs(next,computers,visited,n);
            }
        }
    }
}