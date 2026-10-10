import java.util.*;

class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};
    boolean[][]visited;
    
    public int solution(int[][] maps) {
        int m = maps.length;
        int n = maps[0].length;
        
        visited = new boolean[m][n];
        int[][]dist = new int[m][n];
        
        Queue<int[]>q = new LinkedList<>();
        
        q.add(new int[]{0,0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            
            int x = cur[0];
            int y = cur[1];
            
            if(x == m - 1 && y == n - 1) return dist[x][y];
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx >= 0 && nx < m && ny >= 0 && ny <n && !visited[nx][ny] && maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny});
                    dist[nx][ny] = dist[x][y] + 1;
                }
            }
        }
        
        return -1;
    }
}