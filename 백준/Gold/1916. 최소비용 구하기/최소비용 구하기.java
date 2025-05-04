import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge> {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
        public int compareTo(Edge other) {
            return this.cost - other.cost;
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static ArrayList<Edge>[] graph;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 도시 수
        int m = sc.nextInt(); // 버스 수

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();
            graph[from].add(new Edge(to, cost));
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        distance = new int[n + 1];
        Arrays.fill(distance, INF);
        dijkstra(start);

        System.out.println(distance[end]);
    }

    static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int now = cur.to;

            if (distance[now] < cur.cost) continue;

            for (Edge next : graph[now]) {
                int newCost = distance[now] + next.cost;
                if (distance[next.to] > newCost) {
                    distance[next.to] = newCost;
                    pq.add(new Edge(next.to, newCost));
                }
            }
        }
    }
}
