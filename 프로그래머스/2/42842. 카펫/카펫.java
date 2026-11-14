class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        
        for(int i=1; i<=sum; i++){
            if(sum % i != 0) continue;
            
            int width = sum / i;
            int height = sum / width;
            
            if(width >= height && (width - 2) * (height - 2) == yellow){
                return new int[]{width,height};
            }
            
        }
        return new int[]{};
    }
}