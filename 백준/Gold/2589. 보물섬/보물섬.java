import java.util.*;

public class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 행
        M = sc.nextInt(); // 열
        sc.nextLine(); // 개행 처리

        map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        int maxDistance = 0;

        // 모든 육지(L)에서 출발해서 BFS 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'L') {
                    int distance = bfs(i, j);
                    maxDistance = Math.max(maxDistance, distance);
                }
            }
        }

        System.out.println(maxDistance);
    }

    // BFS 함수 - (x, y)에서 시작해서 가장 멀리까지 가본다
    static int bfs(int x, int y) {
        visited = new boolean[N][M];
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y, 0));
        visited[x][y] = true;

        int max = 0;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            max = Math.max(max, p.dist);

            for (int d = 0; d < 4; d++) {
                int nx = p.x + dx[d];
                int ny = p.y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (!visited[nx][ny] && map[nx][ny] == 'L') {
                        visited[nx][ny] = true;
                        queue.add(new Point(nx, ny, p.dist + 1));
                    }
                }
            }
        }

        return max;
    }

    // 좌표와 거리 정보를 담는 클래스
    static class Point {
        int x, y, dist;

        Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}