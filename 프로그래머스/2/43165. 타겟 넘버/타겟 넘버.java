class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target,0,0);
    }
    
    public int dfs(int[]numbers, int target, int depth, int cur){
        if(depth == numbers.length){
            if(target == cur){
                return 1;
            }else{
                return 0;
            }
        }
        
        int sum = 0;
        sum = sum + dfs(numbers, target, depth + 1, cur + numbers[depth]);
        sum = sum + dfs(numbers, target, depth + 1, cur - numbers[depth]);
        
        return sum;
    }
}