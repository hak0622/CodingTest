import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes,(a,b)->a[1]-b[1]);
        
        int answer = 0;
        int camera = -30001;
        
        for(int i=0; i<routes.length; i++){
            if(routes[i][0] > camera){
                camera = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}