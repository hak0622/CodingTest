class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}