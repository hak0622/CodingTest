class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int width = 1;
        int height = 1;
        
        for(int i=1; i<=sum; i++){
            if(sum % i == 0){
                width = sum / i;
                height = sum / width;
                
                if(width >= height && (width - 2) * (height - 2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                }   
            }        
        }
        return answer;
    }
}