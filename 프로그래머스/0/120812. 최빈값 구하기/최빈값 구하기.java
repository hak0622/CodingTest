class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;
        int repeat = 0;
        
        int[]count = new int[1000];
        
        if(array.length == 1){
            return array[0];
        }
        
        for(int num : array){
            count[num]++;
        }
        
        for(int i=0; i<1000; i++){
            if(count[i] > maxCount){
                maxCount = count[i];
                answer = i;
            }
        }
        
        for(int i=0; i<1000; i++){
            if(count[i] == maxCount){
                repeat++;
            }
        }
        
        return repeat > 1 ? -1 : answer;
    }
}