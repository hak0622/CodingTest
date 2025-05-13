import java.util.*;

class Solution {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        char[][] map = new char[n][m];
        
        int[]start = new int[2];
        int[]lever = new int[2];
        int[]exit = new int[2];
        
        for(int i=0; i<n; i++){
            map[i] = maps[i].toCharArray();
            for(int j=0; j<m; j++){
                if(map[i][j] == 'S'){
                    start[0] = i;
                    start[1] = j;
                }else if(map[i][j] == 'L'){
                    lever[0] = i;
                    lever[1] = j;
                }else if (map[i][j] == 'E'){
                    exit[0] = i;
                    exit[1] = j;
                }
            }
        }
        int toLever = bfs(map,start,lever,n,m);
        if(toLever == -1){
            return -1;
        }
        
        int toExit = bfs(map,lever,exit,n,m);
        if(toExit == -1){
            return -1;
        }
        
        return toLever + toExit;
    }
    
    private int bfs(char[][]map,int[]start,int[]target,int n, int m){
        boolean[][]visited = new boolean[n][m];
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start[0],start[1],0});
        visited[start[0]][start[1]] = true;
        
        while(!q.isEmpty()){
            int[] current = q.remove();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx>=0 && nx<n && ny>=0 && ny<m && map[nx][ny] != 'X'){
                    if(!visited[nx][ny]){
                        if(nx == target[0] && ny ==target[1]){
                            return distance + 1;
                        }
                        q.offer(new int[]{nx,ny,distance+1});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return -1;
    }
}