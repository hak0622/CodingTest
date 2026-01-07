class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;
        boolean[]check = new boolean[n+1];
        
        for(int i=0; i<section.length; i++){
            check[section[i]] = true;
        }
        
        for(int i=1; i<=n; i++){
            if(check[i] && i > paint){
                answer++;
                paint = i + m - 1;
            }
        }
        return answer;
    }
}