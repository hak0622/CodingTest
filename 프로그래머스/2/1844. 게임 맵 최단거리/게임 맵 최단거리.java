import java.util.*;

class Solution {
    int[]dx = {0,0,-1,1};
    int[]dy = {1,-1,0,0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][]visited = new boolean[n][m];
        Queue<int[]>q = new LinkedList<>();
        
        q.add(new int[]{0,0});
        visited[0][0] = true;
        int dist = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                int[]cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                
                if(x == n - 1 && y == m - 1) return dist;
                
                for(int d=0; d<4; d++){
                    int nx = x + dx[d];
                    int ny = y + dy[d];
                    
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            dist++;
        }
        return -1;
    }
}