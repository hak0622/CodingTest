import java.util.*;

class Solution {
    boolean[][]visited;
    char[][]map;
    int n;
    int m;
    int[]dx=new int[]{-1,1,0,0};
    int[]dy=new int[]{0,0,-1,1};
    
    public int[] solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        visited = new boolean[n][m];
        map = new char[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = maps[i].toCharArray();
        }
        
        List<Integer> daysList = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j]&&map[i][j]!='X'){
                    int sum = dfs(i,j);
                    daysList.add(sum);
                }
            }
        }

        if (daysList.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(daysList);
        int[] answer = new int[daysList.size()];
        for (int i = 0; i < daysList.size(); i++) {
            answer[i] = daysList.get(i);
        }

        return answer;
    }

    private int dfs(int x, int y) {
        visited[x][y]=true;
        int sum = map[x][y] - '0';
        
        for(int d=0; d<4; d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(!visited[nx][ny]&&map[nx][ny]!='X'){
                    sum=sum+dfs(nx,ny);
                }
            }
        }
        return sum;
    }
}
