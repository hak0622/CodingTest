class Solution {
    public int solution(int[][] sizes) {
        int[][]resizes = new int[sizes.length][sizes[0].length];
        
        for(int i=0; i<sizes.length; i++){
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            
            resizes[i][0] = w;
            resizes[i][1] = h;
        }
        
        int maxW = resizes[0][0];
        int maxH = resizes[0][1];
        
        for(int i=1; i<resizes.length; i++){
            if(maxW < resizes[i][0]) maxW = resizes[i][0];
            if(maxH < resizes[i][1]) maxH = resizes[i][1];
        }
        
        return maxW * maxH;
    }
}