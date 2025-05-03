import java.util.*;

class Edge implements Comparable<Edge> {
    int target;
    int weight;

    public Edge(int target, int weight) {
        this.target = target;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight; // 거리 작은 것부터 우선순위
    }
}
public class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); // 정점 수
        int E = sc.nextInt(); // 간선 수
        int start = sc.nextInt(); // 시작 노드

        List<Edge>[] graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u].add(new Edge(v, w));
        }

        int[] dist = new int[V + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();
            int curNode = cur.target;
            int curDist = cur.weight;

            if (curDist > dist[curNode]) continue;

            for (Edge next : graph[curNode]) {
                int nextNode = next.target;
                int cost = curDist + next.weight;

                if (cost < dist[nextNode]) {
                    dist[nextNode] = cost;
                    pq.add(new Edge(nextNode, cost));
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (dist[i] == INF) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
