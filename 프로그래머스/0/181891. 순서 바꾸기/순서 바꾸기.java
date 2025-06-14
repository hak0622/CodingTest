import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length*2];
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
            answer[i+num_list.length] = num_list[i];
        }
        return Arrays.copyOfRange(answer,n,num_list.length+n);
    }
}