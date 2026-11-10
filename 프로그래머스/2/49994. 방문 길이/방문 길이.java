class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int solution(String dirs) {
        int dist = 0;
        int x = 5;
        int y = 5;
        
        boolean[][][][]visited = new boolean[11][11][11][11];
        
        for(int i=0; i<dirs.length(); i++){
            char next = dirs.charAt(i);
            
            int d = 0;
            
            if(next == 'U') d = 0;
            else if(next == 'D') d = 1;
            else if(next == 'R') d = 2;
            else d = 3;
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if(nx < 0 || nx >= 11 || ny < 0 || ny >= 11) continue;
            
            if(!visited[x][y][nx][ny]){
                visited[x][y][nx][ny] = true;
                visited[nx][ny][x][y] = true;
                dist++;
            }
            
            x = nx;
            y = ny;
        }
        
        return dist;
    }
}