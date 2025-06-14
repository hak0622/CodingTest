import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            Queue<Point> q = new LinkedList<>();
            int N = sc.nextInt(); // 총 문서 개수
            int M = sc.nextInt(); // 몇 번째로 출력되는지 알고 싶은 문서 index
            int max = 0;
            int[] maxArr = new int[10]; // 중요도는 1~9

            for (int j = 0; j < N; j++) {
                int tempVal = sc.nextInt();
                q.add(new Point(j, tempVal));
                maxArr[tempVal]++;
                if (max < tempVal) {
                    max = tempVal;
                }
            }

            int count = 1;
            while (!q.isEmpty()) {
                Point now = q.poll();
                if (now.value == max) {
                    if (now.index == M) {
                        System.out.println(count);
                        break; 
                    } else {
                        count++;
                        maxArr[max]--;
                        if (maxArr[max] == 0) {
                            for (int j = max - 1; j > 0; j--) {
                                if (maxArr[j] != 0) {
                                    max = j;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    q.add(now);
                }
            }
        }
    }
}

class Point {
    int index;
    int value;

    public Point(int index, int value) {
        this.index = index;
        this.value = value;
    }
}
