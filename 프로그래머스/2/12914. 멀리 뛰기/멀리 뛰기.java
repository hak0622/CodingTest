class Solution {
    public long solution(int n) {
        long[] dp = new long[n + 1]; // n칸까지 도달할 수 있는 방법 수를 저장할 배열

        dp[0] = 1; // 0칸: 방법 1가지 (아무것도 안 함)
        dp[1] = 1; // 1칸: 방법 1가지 (1칸 한번 뛰기)

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567; // 큰 수 방지 위해 나머지 연산
        }

        return dp[n]; // n칸까지 가는 방법의 수 반환
    }
}
