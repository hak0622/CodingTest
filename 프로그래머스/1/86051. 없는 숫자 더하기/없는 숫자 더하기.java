class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] n = new int[10];
        
        for(int i=0; i<numbers.length; i++){
            n[numbers[i]] = 1;
        }
        
        for(int i=0; i<n.length; i++){
            if(n[i] == 0){
                answer += i;
            }
        }
        return answer;
    }
}