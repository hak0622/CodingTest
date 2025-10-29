import java.io.*;
import java.util.*;

public class Main {
    static int N,M,V;
    static List<List<Integer>>graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N+1]; //DFS 수행
        dfs(V);
        System.out.println();

        visited = new boolean[N+1]; //BFS 수행
        bfs(V);
    }

    public static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");

        for(int next : graph.get(node)){
            if(!visited[next]){
                dfs(next);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node + " ");

            for(int next : graph.get(node)){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}