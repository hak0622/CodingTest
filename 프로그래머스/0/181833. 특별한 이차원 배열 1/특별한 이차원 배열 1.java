class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = 0;
            }
        }
        for(int i=0; i<n; i++){
            answer[i][i] = 1;
        }
        return answer;
    }
}