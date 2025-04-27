class Solution {
    boolean[]visited;
    int[][] computers;
    int answer = 0;
    
    public int solution(int n, int[][] computers) {
        this.visited = new boolean[n];
        this.computers = computers;
        
        for(int i=0; i<n; i++){
            if(visited[i]==false){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int curVertex){
        visited[curVertex] = true;
        for(int nextVertex=0; nextVertex<computers[curVertex].length; nextVertex++){
            if(computers[curVertex][nextVertex]==1 && !visited[nextVertex]){
                dfs(nextVertex);
            }
        }
        return;
    }
}