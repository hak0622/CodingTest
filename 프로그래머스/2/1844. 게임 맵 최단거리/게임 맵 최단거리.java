import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[]dx = {-1,1,0,0};
        int[]dy = {0,0,-1,1};
        
        boolean[][]visited = new boolean[n][m];
        Queue<int[]>q = new LinkedList<>();
        
        q.offer(new int[]{0,0});
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int[]cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        maps[nx][ny] = maps[x][y] + 1;
                        q.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        
        int answer = maps[n-1][m-1];
        
        return (answer == 1) ? -1 : answer;
    }
}