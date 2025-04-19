class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown+yellow;
        
        for(int height=3; height<=sum; height++){
            if(sum%height==0){
                int width = sum/height;
                
                if(width>=height){
                    int innerWidth = width -2;
                    int innerHeight = height-2;
                    if(innerWidth * innerHeight == yellow){
                        return new int[]{width,height};
                    }
                }
            }
        }
        return new int[0];
    }
}