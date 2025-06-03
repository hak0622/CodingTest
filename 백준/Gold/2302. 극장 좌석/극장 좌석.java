import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 좌석 개수
        int M = sc.nextInt(); // VIP 좌석 개수

        int[] dp = new int[41]; // 좌석 수는 최대 40
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int answer = 1;
        int beforeSeat = 0;

        // VIP 좌석 번호를 배열로 저장
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt(); // VIP 좌석 입력
            answer *= dp[temp - beforeSeat - 1]; // VIP 사이 간격에 따른 경우의 수 곱셈
            beforeSeat = temp; // 이전 VIP 좌석 갱신
        }

        answer *= dp[N - beforeSeat]; // 마지막 VIP 이후 남은 좌석의 경우의 수 곱셈

        System.out.println(answer);

        sc.close(); // 선택사항이지만 습관적으로 좋습니다
    }
}
