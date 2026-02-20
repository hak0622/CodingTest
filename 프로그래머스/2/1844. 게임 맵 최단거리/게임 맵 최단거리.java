import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[]dx = {1,-1,0,0};
        int[]dy = {0,0,1,-1};
        
        int[][]dist = new int[n][m];
        
        Queue<int[]> q = new LinkedList<>();
        
        if(maps[0][0] == 0) return -1;
        
        q.add(new int[]{0,0});
        dist[0][0] = 1;
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            if(x == n-1 && y == m-1){
                return dist[x][y];
            }
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx < 0 || nx >=n || ny < 0 || ny >= m){
                    continue;
                }
                if(maps[nx][ny] == 0){
                    continue;
                }
                if(dist[nx][ny] != 0){
                    continue;
                }
                
                dist[nx][ny] = dist[x][y] + 1;
                q.add(new int[]{nx,ny});
            }
        }
        return -1;
    }
}