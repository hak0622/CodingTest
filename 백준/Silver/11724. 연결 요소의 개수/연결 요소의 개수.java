import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static boolean[]visited;
    static int count = 0;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n+1];

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    static void dfs(int v){
        visited[v] = true;
        for(int next : graph.get(v)){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}
