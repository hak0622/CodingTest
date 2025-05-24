import java.util.*;
import java.io.*;

public class Main{
    static List<Integer>[]adj;
    static boolean[]visited;
    static int[]parent;
    
    public static void dfs(int node){
        //현재 노드를 방문 처리
        visited[node]=true;
        
        //현재 노드의 연결된 모든 인접 노드를 탐색
        for(int next : adj[node]){
            //인접 노드가 아직 방문되지 않았다면
            if(!visited[next]){
                //인접 노드의 부모를 현재 노드로 설정
                parent[next] = node;
                //인접 노드에서 DFS를 재귀적으로 호출하여 계속 탐색
                dfs(next);
            }
        }
    }
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 개수 
        
        //인접 리스트 초기화
        adj = new ArrayList[n+1];
        
        for(int i=1; i<=n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=1; i<=n-1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b);
            adj[b].add(a);
        }
        parent = new int[n+1];
        visited = new boolean[n+1];
        
        dfs(1);
        
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=n; i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.print(sb);
    }
}