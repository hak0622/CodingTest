import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N,M; //엣지와 간선
    static int[][]arr; //숫자 담는 배열
    static boolean[]visit; //방문 체크 배열

    static int result = 0; 
    static int x,y; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i=1; i<M+1; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }

        for(int i=1; i<N+1; i++){
            if(!visit[i]){
                dfs(i);
                result++;
            }
        }
        System.out.println(result);
    }

    public static void dfs(int node){
        visit[node] = true;
        for(int i=1; i<N+1; i++){
            if(!visit[i] && arr[node][i] == 1){
                dfs(i);
            }
        }
    }
}