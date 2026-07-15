class Solution {
    public int solution(int[][] sizes) {        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]) continue;
            else{
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        
        int wmax = sizes[0][0];
        int hmax = sizes[0][1];
        
        for(int i=1; i<sizes.length; i++){
            wmax = Math.max(wmax, sizes[i][0]);
            hmax = Math.max(hmax, sizes[i][1]);
        }
        return wmax * hmax;
    }
}