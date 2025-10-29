import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static List<List<Integer>>graph = new ArrayList<>();;
    static boolean found = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=0; i<N; i++){
            boolean[]visited = new boolean[N];
            dfs(i,1,visited);
            if(found){
                break;
            }
        }
        System.out.println(found ? 1 : 0);
    }

    public static void dfs(int node,int depth,boolean[]visited){
        if(found) {
            return;
        }
        if(depth == 5){
            found = true;
            return;
        }
        visited[node] = true;

        for(int next : graph.get(node)){
            if(!visited[next]){
                dfs(next,depth + 1,visited);
            }
        }
        visited[node] = false;
    }
}

