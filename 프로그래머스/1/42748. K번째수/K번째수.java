import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[]answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int[]sub = new int[end - start +1];
            int idx = 0;
            
            for(int j=start; j<=end; j++){
                sub[idx++] = array[j];
            }
            
            Arrays.sort(sub);
            
            answer[i] = sub[commands[i][2] - 1];
        }
        return answer;
    }
}

