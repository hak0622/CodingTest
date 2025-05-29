import java.util.*;

class Solution {
    boolean[][]visited;
    int n,m;
    int[]dx = new int[]{-1,1,0,0};
    int[]dy = new int[]{0,0,-1,1};
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        Queue<int[]>q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        visited[0][0]=true;
        
        while(!q.isEmpty()){
            int[]current=q.poll();
            int x = current[0];
            int y = current[1];
            int cnt = current[2];
            
            if(x == n-1 && y == m-1){
                return cnt;
            }
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny]==1 && !visited[nx][ny]){
                   visited[nx][ny] = true;
                    q.add(new int[]{nx,ny,cnt+1});
                }
            }
        }
        return -1;
    }
}