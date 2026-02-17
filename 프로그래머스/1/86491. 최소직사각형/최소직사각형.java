class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for(int i=0; i<sizes.length; i++){
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            int big = Math.max(a,b);
            int small = Math.min(a,b);
            
            if(big > maxW){
                maxW = big;
            }
            if(small > maxH){
                maxH = small;
            }
        }
        return maxW * maxH;
    }
}