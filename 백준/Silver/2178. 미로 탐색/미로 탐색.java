import java.util.*;
import java.io.*;

public class Main {
    static int[]dx = new int[]{-1,1,0,0}; 
    static int[]dy = new int[]{0,0,-1,1};
    static boolean[][]visited;
    static int N,M;
    static int[][]map;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }

    public static void bfs(int x , int y){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[]cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur[0] + dx[k];
                int ny = cur[1] + dy[k];
                if(nx >= 0 && ny >= 0 && nx < N && ny<M){
                    if(!visited[nx][ny] && map[nx][ny] != 0){
                        visited[nx][ny] = true;
                        map[nx][ny] = map[cur[0]][cur[1]] + 1;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}