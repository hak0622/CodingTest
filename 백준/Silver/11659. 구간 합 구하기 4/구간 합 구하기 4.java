import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[]sum = new int[N+1];
        sum[0] = 0;
        for(int i=1; i<=N; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }

        for(int k=0; k<M; k++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum[b]-sum[a-1]);
        }
    }
}