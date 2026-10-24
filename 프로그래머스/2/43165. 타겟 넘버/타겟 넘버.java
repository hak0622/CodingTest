class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,target,0,0);
    }
    
    public int dfs(int[]numbers, int target, int idx, int sum){
        int answer = 0;
        
        if(idx == numbers.length){
            if(sum == target){
                return 1;
            }
            return 0;
        }
        answer = answer + dfs(numbers,target,idx+1,sum+numbers[idx]);
        answer = answer + dfs(numbers,target,idx+1,sum-numbers[idx]);
        
        return answer;
    }
}