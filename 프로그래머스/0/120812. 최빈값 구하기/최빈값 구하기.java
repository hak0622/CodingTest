class Solution {
    public int solution(int[] array) {
        int[]count = new int[1000];
        int max = 0;
        int cnt = 0;
        int answer = -1;
        
        for(int num : array){
            count[num]++;
        }
        
        for(int c : count){
            if(c > max){
                max = c;
            }
        }
        
        for(int i=0; i<1000; i++){
            if(count[i] == max){
                cnt++;
                answer = i;
            }
        }
        
        if(cnt>=2){
            return -1;
        }
        
        return answer;
    }
}