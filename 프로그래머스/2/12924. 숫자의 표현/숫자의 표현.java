class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int left = 1;
        int right = 1;
        
        while(left <= n){
            if(sum < n){
                sum = sum + right;
                right++;
            }else{
                if(sum == n) {
                    answer++;
                }
                
                sum = sum - left;
                left++;
            }
        }
        
        return answer;
    }
}