import java.util.*;

public class Main {
    static int[]dist;
    static List<List<int[]>> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();

        graph = new ArrayList<>();
        dist = new int[D+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        for(int i=0; i<=D; i++){
            graph.add(new ArrayList<>());
        }
        //일반 고속도로 간선 추가
        for(int i=0; i<D; i++){
            graph.get(i).add(new int[]{i+1,1});
        }

        //지름길 간선 추가
        for(int i=0; i<N; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            if(v > D){
                continue;
            }
            if(v-u <= w){
                continue;
            }
            graph.get(u).add(new int[]{v,w});
        }
        die(0);
        System.out.println(dist[D]);
    }
    public static void die(int Start){
        PriorityQueue<int[]> pq = new PriorityQueue<>((n1, n2)-> n1[1]-n2[1]);
        pq.offer(new int[]{Start,0});
        dist[Start]=0;

        while(!pq.isEmpty()){
            int[] a = pq.poll();
            if(dist[a[0]] != a[1]){
                continue;
            }
            for(int[]next : graph.get(a[0])){
                int nextNode = next[0];
                int weight = next[1];

                if(dist[nextNode] > a[1]+weight) {
                    dist[nextNode] = a[1] + weight;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
    }
}
