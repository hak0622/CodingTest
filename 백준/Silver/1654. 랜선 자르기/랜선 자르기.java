import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt(); // 가진 랜선 수
        int N = sc.nextInt(); // 필요한 랜선 수

        int[] arr = new int[K];
        long min = 0;
        long mid = 0;
        long max = 0;

        // 랜선 길이 입력 & 가장 긴 랜선 길이 저장
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        // 최대 길이 +1 로 upper bound 탐색
        max++;

        while (min < max) {
            mid = (min + max) / 2;

            long count = 0;

            for (int i = 0; i < K; i++) {
                count += arr[i] / mid;
            }

            if (count < N) {
                max = mid; // 너무 길어서 개수가 부족함 → 더 짧게 자르기
            } else {
                min = mid + 1; // 충분히 개수 많음 → 더 길게 자를 수 있음
            }
        }

        System.out.println(min - 1); // Upper Bound - 1이 최대 길이
    }
}