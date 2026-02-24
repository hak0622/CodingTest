class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int num = i;
            int sum = 0;
            
            while(sum < n){
                sum = sum + num;
                num = num + 1;
                
                if(sum == n){
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}