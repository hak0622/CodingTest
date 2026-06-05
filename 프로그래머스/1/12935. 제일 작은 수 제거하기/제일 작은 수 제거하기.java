import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer>answer = new ArrayList<>();
        int min = arr[0];
        
        if(arr.length == 1) return new int[]{-1};
        
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            if(min == arr[i]) continue;
            
            answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}