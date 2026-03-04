class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = Math.max(sizes[0][0],sizes[0][1]);
        int min1 = Math.min(sizes[0][0],sizes[0][1]);;
        
        for(int i=1; i<sizes.length; i++){
            int max2 = Math.max(sizes[i][0],sizes[i][1]);
            int min2 = Math.min(sizes[i][0],sizes[i][1]);
            
            max1 = Math.max(max1,max2);
            min1 = Math.max(min1,min2);
        }
        return max1 * min1;
    }
}