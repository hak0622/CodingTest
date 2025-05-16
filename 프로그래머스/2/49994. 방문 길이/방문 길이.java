class Solution {
    static int [] dx = {0,1,0,-1};
    static int [] dy = {1,0,-1,0};
    
    public int solution(String dirs) {
        boolean[][][]visited = new boolean[11][11][4]; // 0:상, 1:우, 2:하, 3:좌
        int x=5, y=5, d=0;
        int answer = 0;
        
        for(char c : dirs.toCharArray()){
            if(c == 'U'){
                d = 0;
            }if(c == 'R'){
                d = 1;
            }if(c == 'D'){
                d = 2;
            }if(c == 'L'){
                d = 3;
            }
             int nx = x + dx[d];
             int ny = y + dy[d];
             if(nx>=0 && nx<11 && ny>=0 && ny<11){
             if(!visited[nx][ny][d]){
                visited[nx][ny][d] = true;
                visited[x][y][(d + 2) % 4] = true;
                answer ++;
             }
             x = nx;
             y = ny;
            }
        }
        return answer;
    }
}