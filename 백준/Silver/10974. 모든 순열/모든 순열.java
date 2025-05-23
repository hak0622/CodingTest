import java.util.*;

public class Main {
    static int N;
    static boolean[] checked;
    static int[] arr;
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        checked = new boolean[N + 1];
        arr = new int[N];

        backTracking(0);
    }
    static void backTracking(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!checked[i]) {
                checked[i] = true;
                arr[depth] = i;
                backTracking(depth + 1);
                checked[i] = false;
            }
        }
    }
}