class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][]dp = new int[n+1][m+1];
        
        dp[1][1] = 1;
        
        for(int[]p : puddles){
            int x = p[0];
            int y = p[1];
            
            dp[y][x] = -1;
        }
        
        for(int y=1; y<=n; y++){
            for(int x=1; x<=m; x++){
                if(dp[y][x] == -1){
                    dp[y][x] = 0;
                    continue;
                }
                
                if(x == 1 && y == 1) continue;
                
                dp[y][x] = (dp[y][x-1] + dp[y-1][x]) % 1000000007;
            }
        }
        return dp[n][m];
    }
}