import java.util.*;

class Solution {
    int[]dx = {-1,1,0,0};
    int[]dy = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]>q = new LinkedList<>();
        boolean[][]visited = new boolean[n][m];
        q.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];
            
            if(x == n-1 && y == m-1) return dist;
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && visited[nx][ny] == false){
                    visited[nx][ny] = true;
                    q.add(new int[]{nx,ny,dist+1});
                }
            }
            
        }
        return -1;
    }
}