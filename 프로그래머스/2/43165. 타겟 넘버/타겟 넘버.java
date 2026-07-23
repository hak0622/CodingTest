class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,target,0,0);
    }
    
    public int dfs(int[]numbers, int target, int index, int cur){
        if(index == numbers.length){
            if(cur == target){
                return 1;
            }else{
                return 0;
            }
        }
        
        int sum = 0;
        sum = sum + dfs(numbers, target, index + 1, cur + numbers[index]);
        sum = sum + dfs(numbers, target, index + 1, cur - numbers[index]);
        
        return sum;
    }
}