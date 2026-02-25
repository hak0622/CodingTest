import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[]answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            List<Integer>list = new ArrayList<>();
            
            int s = commands[i][0];
            int e = commands[i][1];
            int k = commands[i][2];
            
            for(int j=s-1; j<e; j++){
                list.add(array[j]);
            }
            
            Collections.sort(list);
            
            answer[i] = list.get(k-1);
        }
        
        return answer;
    }
}